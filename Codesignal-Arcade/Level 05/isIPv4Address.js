function isIPv4Address(inputString) {
    var result =
        /^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$/.test(inputString);
    return result;
}

console.log(isIPv4Address("172.16.254.1"));
console.log(isIPv4Address("172.316.254.1"));