# simple_kafka

A simple project running in a Docker environment for sending and receiving simple messages using Kafka. It involves a Java producer that receives a string in a controller (POST - /kafka/new) and a Java consumer. Upon accessing the consumer container, the message sent by the producer (you can use Insomnia, for example) will be displayed in its console.

# How to run

Just set permissions to execute the file "startup.sh" 
ex: chmod +x startup.sh

Now the producer will be running on port 8085.