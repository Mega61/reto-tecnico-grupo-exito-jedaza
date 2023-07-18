
# Cloud-based Automatized Test Service in AWS

This infrastructure diagram illustrates the components and flow of a cloud-based automated test service hosted on Amazon Web Services (AWS). The service enables seamless testing of applications through a well-orchestrated flow that ensures efficient test execution and reporting.

## Architecture Overview

![InfraDiagram](https://github.com/Mega61/reto-tecnico-grupo-exito-jedaza/blob/Ejercicio3/Cloud_based_automatized_test_service_diagram.png)

1.  **User**: The user interacts with the system and initiates the test process.
    
2.  **Route53**: The DNS service that routes the user's requests to the API Gateway.
    
3.  **API Gateway**: Acts as a front-facing entry point for the system, handling incoming API requests and forwarding them to the Lambda Orchestrator.
    
4.  **Lambda Orchestrator**: A Lambda function responsible for managing the test orchestration. It coordinates the flow of the tests, interacts with other AWS services, and ensures the proper execution of tests.
    
5.  **CloudWatch**: A monitoring and logging service that collects and tracks metrics, log files, and events from various AWS resources. It helps monitor the performance and health of the entire testing infrastructure.
    
6.  **Simple Queue Service (SQS)**: A fully managed message queue service that acts as a buffer between the Lambda Orchestrator and the Device Farm. It decouples the components, ensuring efficient test distribution and processing.
    
7.  **S3 Bucket**: The storage bucket that holds the artifacts and reports generated during the test execution. It provides durable and scalable object storage for test data.
    
8.  **Device Farm**: An AWS service that facilitates mobile and web app testing on real devices. It runs tests in parallel on multiple devices in an auto-scaling environment, ensuring comprehensive testing coverage.
    
9.  **Autoscaling Zone**: A zone within the Device Farm where the devices scale dynamically based on the number of tests and test executions.
    
10.  **Simple Notification Service (SNS)**: A fully managed messaging service that enables the delivery of notifications and alerts. It notifies the user about test results, completion, or any important events during the test execution.
    
11.  **VPC: TESTING ACCESS**: A Virtual Private Cloud (VPC) that contains the CloudWatch, Device Farm, Lambda Orchestrator, and Simple Notification Service components. This VPC provides secure and isolated access to the testing infrastructure.
    

## Usage

1.  The user initiates the automated test process by making requests through Route53.
    
2.  The API Gateway receives the user's requests and forwards them to the Lambda Orchestrator.
    
3.  The Lambda Orchestrator manages the test flow, utilizing the SQS for queuing and distributing test tasks to the Device Farm.
    
4.  The Device Farm executes the tests on multiple devices, taking advantage of auto-scaling capabilities to handle varying loads.
    
5.  Test results and artifacts are stored in the S3 Bucket for further analysis and reporting.
    
6.  During the test execution, CloudWatch monitors the system's performance and collects important metrics.
    
7.  Upon test completion or specific events, the Simple Notification Service sends notifications back to the user, providing updates on the test progress and results.