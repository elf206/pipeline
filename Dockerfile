FROM golang:1.19

# Set destination for COPY
WORKDIR /app

# Download Go modules
COPY * ./

# Build
RUN CGO_ENABLED=0 GOOS=linux go build -o /docker-app

# Run
CMD ["/docker-app"]
