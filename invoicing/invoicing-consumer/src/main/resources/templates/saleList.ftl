<div>
    <table>
        <tr>
            <th>序号</th>
            <th>单价</th>
            <th>数量</th>
            <th>总价</th>
            <th>日期</th>
            <th>商品</th>
            <th>用户</th>
            <th>操作</th>
        </tr>
        <#list salePage.list as li>
            <tr>
                <td>${li.id}</td>
                <td>${li.price}</td>
                <td>${li.quantity}</td>
                <td>${li.totalPrice}</td>
                <td>${li.saleDate?string("yyyy-MM-dd")}</td>
                <td>${li.productName}</td>
                <td>${li.userName}</td>
                <td><a href="javascript:depList(${li.id})">修改</a><a href="javascript:deleteInfo(${li.id})">删除</a></td>

            </tr>

        </#list>
    </table>

    <div>
        <a href="javascript:startPage()">首页</a>
        <a href="javascript:nextPage()">下一页</a>
        <a href="javascript:upPage()">上一页</a>
        <a href="javascript:endPage()">末页</a>
        第<span id="curPage">${salePage.curPage}</span>页/共<span id="totalPageCount">${salePage.totalPageCount}</span>
    </div>


</div>