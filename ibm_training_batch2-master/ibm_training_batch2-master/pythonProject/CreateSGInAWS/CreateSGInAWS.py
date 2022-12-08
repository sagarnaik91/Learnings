import boto3
import csv

### Customizable variables:
profile = "prod"
security_group_id = "sg-01487bc3e4482ef7e"
port = 25
region = "ap-south-1"
CSV_file = 'C:\\Users\\magicuser\\Downloads\\2021_12_20_20_18_26_exportRulesToCsv.csv'
####

# Read in the list of IPs:
with open((CSV_file), 'r') as f:
    reader = csv.reader(f)
    IPlist = list(reader)

# Start a session, specifying profile credentials and region:
#session = boto3.session.Session(profile_name=(profile),region_name=(region))
session = boto3.session.Session(region_name=(region))
ec2 = session.resource('ec2')
SG = ec2.SecurityGroup(security_group_id)

# First, we remove all existing rules in the group:
#SG.revoke_ingress(IpPermissions=SG.ip_permissions)

#Now, we add the new rules using IPs from the CSV:
for IP in IPlist:
    IPstring = " ".join(str(x) for x in IP)
    #SG.authorize_ingress(IpProtocol="tcp",CidrIp=(IPstring),FromPort=(int(IP[4])),ToPort=(int(IP[5])))
    SG.authorize_ingress(IpProtocol="tcp",FromPort=(int(IP[4])), ToPort=(int(IP[5])))