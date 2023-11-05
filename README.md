## تغییرات داده شده برای گام ۱
-	تغییراتی را که در کد فعلی برنامه می‌دهید، در جدول زیر ثبت کنید و در نهایت تعداد کل تغییرات را اعلان کنید.
    - توجه: مواردی که به عنوان تغییرات باید اعلان شود شامل این موارد هستند:
      1. ساخت کلاس جدید
      2. افزودن تابع جدید به کلاس و یا واسط (برای توابع جدید صرفا اعلام تغییر کنید)
      3. هر خطوط پیاپی‌ای که در تابع main و برای افزودن یک قابلیت جدید اضافه می‌کنید. به عنوان مثال اگر سه خط را به منظور تشخیص نوع سفارش جدید اضافه می‌کنید، آن سه خط را در قالب یک تغییر اعلام کنید (البته جزییات آن را در ستون «شرحی کوتاه از تغییر» توضیح دهید).

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>Order Service</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phone Order Payment</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۲</strong></p>
</td>
<td width="198">
<p>Order Service</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفتی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phone Order Payment</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۳</strong></p>
</td>
<td width="198">
<p>Phone Order Service</p>
</td>
<td width="141">
<p>افزودن کلاس PhoneOrderService</p>
</td>
<td width="292">
<p>یک کلاس برای ثبت و پرداخت تلفنی که اینترفیس Order Service را پیاده‌سازی می‌کند</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۴</strong></p>
</td>
<td width="198">
<p>Phone Order Service</p>
</td>
<td width="141">
<p>افزودن توابعی که اینترفیس Order Service فراهم می‌کند. </p>
</td>
<td width="292">
<p>توابع PhoneOrderRegister و PhoneOrderPayment دارای پیاده‌سازی هستند و سایر توابع بدنه خالی دارند</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۵</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن قابلیت انتخاب روش پرداخت تلفنی</p>
</td>
<td width="292">
<p>در قسمت انتخاب روش پرداخت حالت دیگری برای پرداخت تلفنی ایجاد می‌کنیم.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۶</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن پرداخت تلفنی</p>
</td>
<td width="292">
<p>چک کردن اینکه orderService اگر instance کلاس PhoneOrderService باشد را اضافه می‌کنیم. سپس مبلغ به صورت تلفنی پرداخت می‌شود.</p>
</td>
</tr>
</tbody>
</table>

مجموع تعداد تغییرات: .......۶.......
