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
<p>Online Order Service</p>
</td>
<td width="141">
<p>افزودن توابع مربوط به Phone Register and Phone Payment </p>
</td>
<td width="292">
<p>توابع جدیدی که به اینترفیس OrderService اضافه شدند باید در اینجا نیز Override بشوند (هرچند با بدنه خالی).</p>
</td>
</tr>
    <tr>
<td width="64">
<p><strong>۶</strong></p>
</td>
<td width="198">
<p>OnSite Order Service</p>
</td>
<td width="141">
<p> افزودن توابع مربوط به Phone Register and Phone Payment </p>
</td>
<td width="292">
<p>توابع جدیدی که به اینترفیس OrderService اضافه شدند باید در اینجا نیز Override بشوند (هرچند با بدنه خالی).</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۷</strong></p>
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
<p><strong>۸</strong></p>
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

مجموع تعداد تغییرات: .......۸.......
## تغییرات در گام ۲
### گام ۲: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID
در خصوص این برنامه‌ای که نوشته شده بود و شما یک قابلیت به آن اضافه کردید، بر اساس اصول SOLID موارد نقض و یا محقق شدن هر کدام از آن اصول را بیان کنید. در بیان موارد تحقق و نقض، علت تحقق و یا نقض را نیز به صورت کامل توضیح دهید:
<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>در سایر کلاس‌ها می‌توان گفت تقزیبا این اصل رعایت شده و تخلف شدیدی صورت نگرفته</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>اینترفیس OrderService دارای توابعی است که هم مربوط به ثبت و هم مربوط به پرداخت است. بهتر است توابع هر یک از این دو کاربرد در اینترفیس‌های جدا تعریف شود.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>اینترفیس OrderService این اصل را رعایت کرده است. می‌توان قابلیت‌های جدید به آن اضافه کرد بدون آنکه لازم باشد ساختار موجود را تغییر داد.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>می‌توان گفت کلاس‌ها این اصل را رعایت کرده‌اند و تخلف شدیدی صورت نگرفته است.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>کلاس‌های OnlineOrderService و OnSiteOrderService و PhoneOrderService می‌توانند به‌جای اینترفیس پدر خود یعنی OrderService استفاده شوند و بنابراین این اصل رعایت شده است.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>تخلفی برای این اصل رخ نداده است.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>این اصل محقق نشده است.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>اینترفیس OrderService شامل توابعی است که هم برای ثبت سفارش و هم برای پرداخت استفاده می‌شوند. بنابراین کلاس‌های استفاده‌کننده از آن مجبور می‌شوند همه این توابع را پیاده‌سازی کنند، حتی اگر بعضی از آن‌ها را نیاز نداشته باشند.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>کلاس Main وابسته به اینترفیس سطح بالا Order Service می‌باشد و وابسته به کلاس‌های سطح پایین‌تر آن نمی‌باشد.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>برای این اصل تخلف شدیدی رخ نداده است.</p>
</td>
</tr>
</tbody>
</table>

در خصوص هرکدام از موارد نقض هرکدام از اصول، یک راهکار را به منظور رفع آن مشکل ارایه داده و در جدول زیر ثبت نمایید:

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>


