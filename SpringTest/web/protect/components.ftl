<#macro greet>
    <h1>hello there</h1>
</#macro>

<#macro hello person how>
    <h1>hello this is ${person} ${how}</h1>
</#macro>

<#macro border>
    <table border="1" cellspacing="0" cellpadding="4">
        <tr>
            <td>
                <#nested >
            </td>
            <td>
                <#nested >
            </td>
        </tr>
    </table>
</#macro>

<#macro testLocal>
    <#local y="eragon">
    <h1>${y}</h1>
    <#if ajaxQueryTable_inner?has_content>
        ${ajaxQueryTable_inner}
    </#if>
</#macro>


<#macro queryTable headItems>
    <table border="1" cellpadding="0">
        <thead>
            <tr>
                <#list headItems as item>
                    <th>${item.name!''}</th>
                </#list>
            </tr>

        </thead>
        <tbody>
            <tr>
                <td colspan="${headItems?size}"></td>
            </tr>
        </tbody>
    </table>
</#macro>

<#macro innerOfQueryTable >
    <#assign ajaxQueryTable_inner>
        <#nested />
    </#assign>
</#macro>