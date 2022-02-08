# Software

1. SAM

https://aws.amazon.com/pt/serverless/sam/

2. AWS CLI
https://docs.aws.amazon.com/cli/latest/userguide/getting-started-install.html

**Configuração:**

No arquivo `~\.aws\config`:
```
[NOME DO PROFILE]
region = sa-east-1
output = json
cli_binary_format = raw-in-base64-out
```

No arquivo `~\.aws\credentials`:
```
[NOME DO PROFILE]
aws_access_key_id = XXXXXXXXXXX
aws_secret_access_key = YYYYYYYYYYYYY
```

3. Plugins IntelliJ:
* AWS CloudFormation
* AWS Toolkit


#Build

mvn package
sam deploy --stack-name aws-sample-proj --region sa-east-1 --profile cip-poc --s3-bucket poc-observabilidade --capabilities CAPABILITY_IAM

#Debug

sam local invoke SampleLambdaFunction -d 5050 -e payload.json

# Troubleshooting

1. HTTP 502 "Malformed Lambda proxy response" errors from API Gateway REST APIs
   https://aws.amazon.com/pt/premiumsupport/knowledge-center/malformed-502-api-gateway/


# HTTP API vs REST API
https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-vs-rest.html

# Lambda Limits 
https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-limits.html

