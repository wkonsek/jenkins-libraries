def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def set(){
    environment {
    	TEST='test'
    }
}
