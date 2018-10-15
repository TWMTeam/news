
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/read.css" rel="stylesheet" type="text/css" />

</head>

<div id="container">
  <%@include file="index-elements/index_sidebar.jsp"%>
  <div class="main">
    <div class="class_type"> <img src="images/class_type.gif" alt="新闻中心" /> </div>
    <div class="content">
      <ul class="classlist">
        <table width="80%" align="center">
          <tr width="100%">
            <td colspan="2" align="center"></td>
          </tr>
          <tr>
            <td colspan="2"><hr />
            </td>
          </tr>
          <tr>
            <td align="center">作者：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
             </td>
            <td align="left">发布时间</td>
          </tr>          
          <tr>
            <td colspan="2" align="center"></td>
          </tr>
          <tr>
            <td colspan="2"></td>
          </tr>
          <tr>
            <td colspan="2">
            </td>
          </tr>
        </table>
      </ul>
      <ul class="classlist">
        <table width="80%" align="center">

        </table>
      </ul>
      <ul class="classlist">
        <form action="" method="post" >
          <table width="80%" align="center">
            <tr>
              <td> 评 论 </td>
            </tr>
            <tr>
              <td> 用户名： </td>
              <td>

                IP：
                <input name="cip" id="cip" value="" readonly="readonly" style="border:0px;"/>
              </td>
            </tr>
            <tr>
              <td colspan="2"><textarea name="ccontent" id="ccontent" cols="70" rows="10"></textarea>
              </td>
            </tr>
            <tr>
            <td><input name="submit" value="发  表" type="submit"/>
              </td>
              </tr>
          </table>
        </form>
      </ul>
    </div>
  </div>
</div>
</html>