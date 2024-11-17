document.addEventListener('DOMContentLoaded', function () {
    const searchBox = document.getElementById('searchBox');
    const customerTable = document.getElementById('customerTable');

    // Tìm kiếm trong bảng
    searchBox.addEventListener('input', function () {
        const filter = searchBox.value.toLowerCase();
        const rows = customerTable.getElementsByTagName('tr');

        for (let i = 0; i < rows.length; i++) {
            const cells = rows[i].getElementsByTagName('td');
            let match = false;
            for (let j = 0; j < cells.length; j++) {
                if (cells[j].textContent.toLowerCase().includes(filter)) {
                    match = true;
                    break;
                }
            }
            rows[i].style.display = match ? '' : 'none';
        }
    });

    // Thêm khách thuê (mở modal hoặc thêm hàng động)
    const btnAdd = document.getElementById('btnAdd');
    btnAdd.addEventListener('click', function () {
        alert('Chức năng thêm khách thuê!');
    });
});
