function IsMAC48Address (inputString) {

    const regex = new 
    RegExp('^[0-9a-fA-F]{1}[0-9a-fA-F]{1}?\-' + 
    '[0-9a-fA-F]{1}[0-9a-fA-F]{1}?\-[0-9a-fA-F]{1}' + 
    '[0-9a-fA-F]{1}?\-[0-9a-fA-F]{1}[0-9a-fA-F]{1}' + 
    '?\-[0-9a-fA-F]{1}[0-9a-fA-F]{1}?\-' + 
    '[0-9a-fA-F]{1}[0-9a-fA-F]$', 'g');
    return regex.test(inputString);
}

console.log(IsMAC48Address('00-1B-63-84-45-E6'));
console.log(IsMAC48Address('Z1-1B-63-84-45-E6'));
console.log(IsMAC48Address('0-12-34-56-78-9A'));