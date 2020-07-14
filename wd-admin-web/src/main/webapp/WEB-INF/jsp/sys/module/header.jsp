<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Main Header -->
<header class="main-header">

	<!-- Logo -->
	<a href="javascript:;" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
		<span class="logo-mini"><b></b></span> <!-- logo for regular state and mobile devices -->
		<span class="logo-lg"><b></b>AdminWEB</span>
	</a>

	<!-- Header Navbar -->
	<nav class="navbar navbar-static-top" role="navigation">
		<!-- Sidebar toggle button-->
		<a href="javascript:;" class="sidebar-toggle" data-toggle="offcanvas"
			role="button"> <span class="sr-only">导航开关</span>
		</a>
		<!-- Navbar Right Menu -->
		<div class="navbar-custom-menu">
			<ul class="nav navbar-nav">
				<!-- User Account Menu -->
				<li class="dropdown user user-menu">
					<i class="fa fa-sort-desc"></i>
					<!-- Menu Toggle Button -->
					<a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown">
						<img
						src="${pageContext.request.contextPath}/static/AdminLTE/dist/img/user.jpg" class="user-image"
						alt="User Image" />
						<span class="hidden-xs">${user.name}</span>
					</a>
					<ul class="dropdown-menu">
						<!--&lt;!&ndash; The user image in the menu &ndash;&gt;-->
						<!--<li class="user-header"><img src="${pageContext.request.contextPath}/static/AdminLTE/dist/img/user.jpg"-->
							<!--class="img-circle" alt="User Image" />-->
							<!--<p>-->
								<!--${user.name} <small>上次登录${user.loginDate}</small>-->
							<!--</p></li>-->
						<!-- Menu Footer-->
						<!--<li class="user-footer">-->
							<!--<div class="pull-left">-->
								<!--<a href="javascript:;" data-url="user/editPwd" data-model='dialog' class="btn btn-default btn-flat">修改密码</a>-->
							<!--</div>-->
							<!--<div class="pull-right">-->
								<!--<a href="logout" class="btn btn-flat btn-danger">退出</a>-->
							<!--</div>-->
						<!--</li>-->
						<li>
                            <i class="fa fa-key"></i>
							<a href="javascript:;" data-url="user/editPwd" data-model='dialog' class="">修改密码</a>
						</li>
						<li>
                            <i class="fa fa-sign-out"></i>
							<a href="logout" class="">退出</a>
						</li>

					</ul>
				</li>
				<!-- Control Sidebar Toggle Button -->
				<li><a href="javascript:;" data-toggle="control-sidebar" class="head-tool"><i
						class="fa fa-gears"></i></a></li>
			</ul>
		</div>
	</nav>
</header>