<#assign titleName=TestUtils.getName("how old are you")/>
<#assign address=showAddress("wuhan")/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>this is the first freemarker example</title>
</head>
<body>
    <@testLocal>
        <@innerOfQueryTable>
            <h2>asdaaaaaaaaaa</h2>
        </@innerOfQueryTable>
    </@testLocal>

    <@queryTable headItems=[
    {"id":"branch_no", "name":"分支机构代码"},
    {"id":"branch_name", "name":"机构名称"},
    {"id":"branch_type", "name":"营业部类别", "dict_entry":"1010"},
    {"id":"address", "name":"联系地址", "provider":"dealAddressAllbranch"},
    {"id":"status", "name":"状态", "dict_entry":"10001"},
    {"id":"op", "name":"操作", "class":"text-c", "provider":"dealOpAllbranch", "width":"15%"}
    ]>

    </@queryTable>
</html>