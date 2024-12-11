<%@ page isELIgnored="false" %>
<html>
<body>
 <div style="color:red;">
        ${failure}
    </div>
    <h1>Product Details Form</h1>


    <form action="purchase" method="post">

       Product Name
        <input type="text" name="name" value="${productdto.name}"><br>

        Product Type<select  name="type" >
            <option value="" disabled selected>Select Type</option>
            <option value="Electronics">Electronics</option>
            <option value="Furniture">Furniture</option>
            <option value="Clothing">Clothing</option>
            <option value="Grocery">Grocery</option>
            <option value="Medical">Medical</option>
        </select><br>


       Product Cost
        <input type="text"    name="cost"  value="${productdto.cost}"><br>


       Manufacturer
        <select name="manf" >
            <option value="" disabled selected>Select Manufacturer</option>
            <option value="Sony">Sony</option>
            <option value="Samsung">Samsung</option>
            <option value="LG">LG</option>
            <option value="Apple">Apple</option>
            <option value="Apolo">Dolo</option>
        </select><br>


       Manufacturing Date
        <input type="date" name="manfDate"  value="${productdto.manfDate}"><br>

     Warranty
        <input type="text" name="warranty"  value="${productdto.warranty}"><br>


        <button type="submit"  >Submit</button>
    </form>
</body>
</html>

