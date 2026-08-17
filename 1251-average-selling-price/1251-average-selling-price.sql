select a.product_id,round(coalESCE(sum(a.price*b.units)/sum(b.units),0),2) as average_price
from prices a 
left join UnitsSold b
on a.product_id=b.product_id
and b.purchase_date  between a.start_date and a.end_date  
group by a.product_id




















