<div>
    <select id="select">
        <#list list as li>
            <option value="${li.id}">${li.productName}</option>
        </#list>

    </select>
    <div>
        <span>单价</span>
        <input type="text" id="price"/>
    </div>
    <div>
        <span>数量</span>
        <input type="text" id="quantity"/>
    </div>
    <input type="button" onclick="addSales()" value="提交"/>

</div>