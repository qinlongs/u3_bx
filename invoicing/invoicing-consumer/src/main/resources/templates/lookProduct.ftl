<div>

    <select id="select">
        <#list list as li>
            <option value="${li.id}">${li.productName}</option>
        </#list>
    </select>
    <input type="button" onclick="queryQu()" value="查看"/>

</div>