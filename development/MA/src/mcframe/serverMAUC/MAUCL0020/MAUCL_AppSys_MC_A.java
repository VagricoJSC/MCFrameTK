package mcframe.serverMAUC.MAUCL0020;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MAUCL_AppSys"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUCL_AppSys_MC_A extends mcframe.serverCore.logic.MCLogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MAUC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MAUCL0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MAUCL_AppSys.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MAUCL0020_Srch01_INFO;
		this.aSrch01 = ((MAUCL_AppSys)this).new Srch01();
	}

	public static MAUCL_AppSys.Srch01 crtSrch01() {
		MAUCL_AppSys lgc = new MAUCL_AppSys();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addDownBlock(aSrch01.down0());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * CoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0020.CoR createCoR(){
		return mcframe.serverMAUC.MAUCL0020.CoR.create();
	}
	protected MAUCL_AppSys.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MA_MAUCL0020_Srch02_INFO;
		this.aSrch02 = ((MAUCL_AppSys)this).new Srch02();
	}

	public static MAUCL_AppSys.Srch02 crtSrch02() {
		MAUCL_AppSys lgc = new MAUCL_AppSys();
		lgc.initSrch02();
		return lgc.aSrch02;
	}

	protected void paramSrch02(MCParam p) {
		if (this.aSrch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addDownBlock(aSrch02.down0());
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * SysParmブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0020.SysParmR createSysParmR(){
		return mcframe.serverMAUC.MAUCL0020.SysParmR.create();
	}

	/**
	 * SysParmブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL0020.SysParmR> createSysParmL(){
		return MCList.create(mcframe.serverMAUC.MAUCL0020.SysParmR.class);
	}
	protected MAUCL_AppSys.Srch03 aSrch03;

	protected void initSrch03() {
		this.info = PDef.MA_MAUCL0020_Srch03_INFO;
		this.aSrch03 = ((MAUCL_AppSys)this).new Srch03();
	}

	public static MAUCL_AppSys.Srch03 crtSrch03() {
		MAUCL_AppSys lgc = new MAUCL_AppSys();
		lgc.initSrch03();
		return lgc.aSrch03;
	}

	protected void paramSrch03(MCParam p) {
		if (this.aSrch03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addDownBlock(aSrch03.down0());
	}

	protected void doSrch03() {
		aSrch03.call();
	};

	/**
	 * TermブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0020.TermR createTermR(){
		return mcframe.serverMAUC.MAUCL0020.TermR.create();
	}

	/**
	 * TermブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL0020.TermR> createTermL(){
		return MCList.create(mcframe.serverMAUC.MAUCL0020.TermR.class);
	}
	protected MAUCL_AppSys.Srch04 aSrch04;

	protected void initSrch04() {
		this.info = PDef.MA_MAUCL0020_Srch04_INFO;
		this.aSrch04 = ((MAUCL_AppSys)this).new Srch04();
	}

	public static MAUCL_AppSys.Srch04 crtSrch04() {
		MAUCL_AppSys lgc = new MAUCL_AppSys();
		lgc.initSrch04();
		return lgc.aSrch04;
	}

	protected void paramSrch04(MCParam p) {
		if (this.aSrch04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addDownBlock(aSrch04.down0());
	}

	protected void doSrch04() {
		aSrch04.call();
	};

	/**
	 * BaseCurブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0020.BaseCurR createBaseCurR(){
		return mcframe.serverMAUC.MAUCL0020.BaseCurR.create();
	}
	protected MAUCL_AppSys.Srch05 aSrch05;

	protected void initSrch05() {
		this.info = PDef.MA_MAUCL0020_Srch05_INFO;
		this.aSrch05 = ((MAUCL_AppSys)this).new Srch05();
	}

	public static MAUCL_AppSys.Srch05 crtSrch05() {
		MAUCL_AppSys lgc = new MAUCL_AppSys();
		lgc.initSrch05();
		return lgc.aSrch05;
	}

	protected void paramSrch05(MCParam p) {
		if (this.aSrch05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addDownBlock(aSrch05.down0());
	}

	protected void doSrch05() {
		aSrch05.call();
	};

	/**
	 * PtaxCurブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0020.PtaxCurR createPtaxCurR(){
		return mcframe.serverMAUC.MAUCL0020.PtaxCurR.create();
	}
	protected MAUCL_AppSys.Srch06 aSrch06;

	protected void initSrch06() {
		this.info = PDef.MA_MAUCL0020_Srch06_INFO;
		this.aSrch06 = ((MAUCL_AppSys)this).new Srch06();
	}

	public static MAUCL_AppSys.Srch06 crtSrch06() {
		MAUCL_AppSys lgc = new MAUCL_AppSys();
		lgc.initSrch06();
		return lgc.aSrch06;
	}

	protected void paramSrch06(MCParam p) {
		if (this.aSrch06 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addDownBlock(aSrch06.down0());
	}

	protected void doSrch06() {
		aSrch06.call();
	};

	/**
	 * GdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0020.GdR createGdR(){
		return mcframe.serverMAUC.MAUCL0020.GdR.create();
	}
	protected MAUCL_AppSys.Srch07 aSrch07;

	protected void initSrch07() {
		this.info = PDef.MA_MAUCL0020_Srch07_INFO;
		this.aSrch07 = ((MAUCL_AppSys)this).new Srch07();
	}

	public static MAUCL_AppSys.Srch07 crtSrch07() {
		MAUCL_AppSys lgc = new MAUCL_AppSys();
		lgc.initSrch07();
		return lgc.aSrch07;
	}

	protected void paramSrch07(MCParam p) {
		if (this.aSrch07 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addDownBlock(aSrch07.down0());
	}

	protected void doSrch07() {
		aSrch07.call();
	};

	/**
	 * LicenceブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0020.LicenceR createLicenceR(){
		return mcframe.serverMAUC.MAUCL0020.LicenceR.create();
	}
	protected MAUCL_AppSys.Srch08 aSrch08;

	protected void initSrch08() {
		this.info = PDef.MA_MAUCL0020_Srch08_INFO;
		this.aSrch08 = ((MAUCL_AppSys)this).new Srch08();
	}

	public static MAUCL_AppSys.Srch08 crtSrch08() {
		MAUCL_AppSys lgc = new MAUCL_AppSys();
		lgc.initSrch08();
		return lgc.aSrch08;
	}

	protected void paramSrch08(MCParam p) {
		if (this.aSrch08 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addDownBlock(aSrch08.down0());
	}

	protected void doSrch08() {
		aSrch08.call();
	};

	/**
	 * DblinkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0020.DblinkR createDblinkR(){
		return mcframe.serverMAUC.MAUCL0020.DblinkR.create();
	}
	protected MAUCL_AppSys.Srch09 aSrch09;

	protected void initSrch09() {
		this.info = PDef.MA_MAUCL0020_Srch09_INFO;
		this.aSrch09 = ((MAUCL_AppSys)this).new Srch09();
	}

	public static MAUCL_AppSys.Srch09 crtSrch09() {
		MAUCL_AppSys lgc = new MAUCL_AppSys();
		lgc.initSrch09();
		return lgc.aSrch09;
	}

	protected void paramSrch09(MCParam p) {
		if (this.aSrch09 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addDownBlock(aSrch09.down0());
	}

	protected void doSrch09() {
		aSrch09.call();
	};

	/**
	 * CoParmブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0020.CoParmR createCoParmR(){
		return mcframe.serverMAUC.MAUCL0020.CoParmR.create();
	}
	protected MAUCL_AppSys.Srch10 aSrch10;

	protected void initSrch10() {
		this.info = PDef.MA_MAUCL0020_Srch10_INFO;
		this.aSrch10 = ((MAUCL_AppSys)this).new Srch10();
	}

	public static MAUCL_AppSys.Srch10 crtSrch10() {
		MAUCL_AppSys lgc = new MAUCL_AppSys();
		lgc.initSrch10();
		return lgc.aSrch10;
	}

	protected void paramSrch10(MCParam p) {
		if (this.aSrch10 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addDownBlock(aSrch10.down0());
	}

	protected void doSrch10() {
		aSrch10.call();
	};

	/**
	 * UsrAclブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL0020.UsrAclR createUsrAclR(){
		return mcframe.serverMAUC.MAUCL0020.UsrAclR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 会社情報の取得（クライアントとの通信用）<br>
	 */
	abstract public class Srch01 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0020.CoR down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			down0 = mcframe.serverMAUC.MAUCL0020.CoR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_AppSys)MAUCL_AppSys_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0020.CoR createCoR(){
			return mcframe.serverMAUC.MAUCL0020.CoR.create();
		}

		//-------------------------外部 I/F--------------------------

		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>co.co_cd</td></tr>
		 * 	<tr><td><br></td><td>co.co_nm</td></tr>
		 * 	<tr><td><br></td><td>co.co_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>co.co_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>co.co_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>co.co_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>co.zip_cd</td></tr>
		 * 	<tr><td><br></td><td>co.addr1</td></tr>
		 * 	<tr><td><br></td><td>co.addr2</td></tr>
		 * 	<tr><td><br></td><td>co.addr3</td></tr>
		 * 	<tr><td><br></td><td>co.addr4</td></tr>
		 * 	<tr><td><br></td><td>co.tel</td></tr>
		 * 	<tr><td><br></td><td>co.fax</td></tr>
		 * 	<tr><td><br></td><td>co.co_repl_nm</td></tr>
		 * 	<tr><td><br></td><td>co.ein</td></tr>
		 * 	<tr><td><br></td><td>co.biz_co_no</td></tr>
		 * 	<tr><td><br></td><td>co.std_co_cd</td></tr>
		 * 	<tr><td><br></td><td>co.cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>co.area_cd</td></tr>
		 * 	<tr><td><br></td><td>co.base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>co.ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>co.st_mon</td></tr>
		 * 	<tr><td><br></td><td>co.ac_cl_day</td></tr>
		 * 	<tr><td><br></td><td>co.ac_cl_mon_base</td></tr>
		 * 	<tr><td><br></td><td>co.ar_no_use_flg</td></tr>
		 * 	<tr><td><br></td><td>co.ap_no_use_flg</td></tr>
		 * 	<tr><td><br></td><td>co.temp_ap_use_flg</td></tr>
		 * 	<tr><td><br></td><td>co.std_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>co.bill_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>co.sls_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>co.rcv_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>co.purc_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>co.pay_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>co.sls_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>co.rcv_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>co.purc_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>co.pay_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>co.stk_cl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>co.sls_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>co.sls_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>co.rcv_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>co.rcv_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>co.purc_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>co.purc_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>co.pay_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>co.pay_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>co.stk_cl_delay_days</td></tr>
		 * 	<tr><td><br></td><td>co.stk_cl_ba_typ</td></tr>
		 * 	<tr><td><br></td><td>co.sls_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>co.purc_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>co.prov_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>co.bill_xrate_conv_flg</td></tr>
		 * 	<tr><td><br></td><td>co.bill_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>co.pay_xrate_conv_flg</td></tr>
		 * 	<tr><td><br></td><td>co.pay_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>co.mon01_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>co.mon02_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>co.mon03_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>co.mon04_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>co.mon05_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>co.mon06_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>co.mon07_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>co.mon08_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>co.mon09_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>co.mon10_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>co.mon11_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>co.mon12_xrate_rev_flg</td></tr>
		 * 	<tr><td><br></td><td>co.sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>co.purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>co.outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>co.xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>co.sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>co.bill_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>co.ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>co.xfr_stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>co.setoff_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>co.com_paid_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>co.wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>co.stk_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>co.stk_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>co.sls_bdj_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>co.po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>co.stk_lst_cnf_num</td></tr>
		 * 	<tr><td><br></td><td>co.stk_lst_limit_num</td></tr>
		 * 	<tr><td><br></td><td>co.gm_std_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>co.stk_std_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>co.early_ship_dt_add_days</td></tr>
		 * 	<tr><td><br></td><td>co.ac_slip_digit</td></tr>
		 * 	<tr><td><br></td><td>co.ac_slip_seq_flg</td></tr>
		 * 	<tr><td><br></td><td>co.rpt_strg_ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>co.memo1</td></tr>
		 * 	<tr><td><br></td><td>co.memo2</td></tr>
		 * 	<tr><td><br></td><td>co.memo3</td></tr>
		 * 	<tr><td><br></td><td>co.dt_switch_time</td></tr>
		 * 	<tr><td><br></td><td>co.pay_schd_cl_cal_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL0020.CoR
		 */
		public mcframe.serverMAUC.MAUCL0020.CoR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_AppSys)MAUCL_AppSys_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * システムパラメータを取得します。<br>
	 */
	abstract public class Srch02 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0020.SysParmR> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			down0 = MCList.create(mcframe.serverMAUC.MAUCL0020.SysParmR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_AppSys)MAUCL_AppSys_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * SysParmブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0020.SysParmR createSysParmR(){
			return mcframe.serverMAUC.MAUCL0020.SysParmR.create();
		}

		/**
		 * SysParmブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0020.SysParmR> createSysParmL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0020.SysParmR.class);
		}

		//-------------------------外部 I/F--------------------------

		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sp.parm_key</td></tr>
		 * 	<tr><td><br></td><td>sp.parm_val</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0020.SysParmR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_AppSys)MAUCL_AppSys_MC_A.this).info;
		}


	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 対象期間マスタを取得します。<br>
	 */
	abstract public class Srch03 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL0020.TermR> down0;
		
		
		// コンストラクタ
		protected Srch03() {
			
			// このオペレーションのコンテナ初期化
			down0 = MCList.create(mcframe.serverMAUC.MAUCL0020.TermR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_AppSys)MAUCL_AppSys_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * TermブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0020.TermR createTermR(){
			return mcframe.serverMAUC.MAUCL0020.TermR.create();
		}

		/**
		 * TermブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL0020.TermR> createTermL(){
			return MCList.create(mcframe.serverMAUC.MAUCL0020.TermR.class);
		}

		//-------------------------外部 I/F--------------------------

		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>term_end_ym</td></tr>
		 * 	<tr><td><br></td><td>term_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL0020.TermR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_AppSys)MAUCL_AppSys_MC_A.this).info;
		}


	}
	/**
	 * Srch04オペレーション.<p>
	 *
	 * 基準通貨情報の取得（クライアントとの通信用）<br>
	 */
	abstract public class Srch04 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0020.BaseCurR down0;
		
		
		// コンストラクタ
		protected Srch04() {
			
			// このオペレーションのコンテナ初期化
			down0 = mcframe.serverMAUC.MAUCL0020.BaseCurR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_AppSys)MAUCL_AppSys_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * BaseCurブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0020.BaseCurR createBaseCurR(){
			return mcframe.serverMAUC.MAUCL0020.BaseCurR.create();
		}

		//-------------------------外部 I/F--------------------------

		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bc.cur_cd</td></tr>
		 * 	<tr><td><br></td><td>bc.cur_nm</td></tr>
		 * 	<tr><td><br></td><td>bc.amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>bc.upri_dec_place</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL0020.BaseCurR
		 */
		public mcframe.serverMAUC.MAUCL0020.BaseCurR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_AppSys)MAUCL_AppSys_MC_A.this).info;
		}


	}
	/**
	 * Srch05オペレーション.<p>
	 *
	 * 納税通貨情報の取得（クライアントとの通信用）<br>
	 */
	abstract public class Srch05 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0020.PtaxCurR down0;
		
		
		// コンストラクタ
		protected Srch05() {
			
			// このオペレーションのコンテナ初期化
			down0 = mcframe.serverMAUC.MAUCL0020.PtaxCurR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_AppSys)MAUCL_AppSys_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PtaxCurブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0020.PtaxCurR createPtaxCurR(){
			return mcframe.serverMAUC.MAUCL0020.PtaxCurR.create();
		}

		//-------------------------外部 I/F--------------------------

		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pc.cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pc.cur_nm</td></tr>
		 * 	<tr><td><br></td><td>pc.amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pc.upri_dec_place</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL0020.PtaxCurR
		 */
		public mcframe.serverMAUC.MAUCL0020.PtaxCurR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_AppSys)MAUCL_AppSys_MC_A.this).info;
		}


	}
	/**
	 * Srch06オペレーション.<p>
	 *
	 * デフォルトの格付情報の取得（クライアントとの通信用）<br>
	 */
	abstract public class Srch06 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch06";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0020.GdR down0;
		
		
		// コンストラクタ
		protected Srch06() {
			
			// このオペレーションのコンテナ初期化
			down0 = mcframe.serverMAUC.MAUCL0020.GdR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_AppSys)MAUCL_AppSys_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * GdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0020.GdR createGdR(){
			return mcframe.serverMAUC.MAUCL0020.GdR.create();
		}

		//-------------------------外部 I/F--------------------------

		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gd.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd.gd_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL0020.GdR
		 */
		public mcframe.serverMAUC.MAUCL0020.GdR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_AppSys)MAUCL_AppSys_MC_A.this).info;
		}


	}
	/**
	 * Srch07オペレーション.<p>
	 *
	 * ライセンス情報の取得（クライアントとの通信用）<br>
	 */
	abstract public class Srch07 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch07";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0020.LicenceR down0;
		
		
		// コンストラクタ
		protected Srch07() {
			
			// このオペレーションのコンテナ初期化
			down0 = mcframe.serverMAUC.MAUCL0020.LicenceR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_AppSys)MAUCL_AppSys_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * LicenceブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0020.LicenceR createLicenceR(){
			return mcframe.serverMAUC.MAUCL0020.LicenceR.create();
		}

		//-------------------------外部 I/F--------------------------

		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>medicine_enable_flg</td></tr>
		 * 	<tr><td><br></td><td>plmlink_enable_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL0020.LicenceR
		 */
		public mcframe.serverMAUC.MAUCL0020.LicenceR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_AppSys)MAUCL_AppSys_MC_A.this).info;
		}


	}
	/**
	 * Srch08オペレーション.<p>
	 *
	 * マスタ参照用データベースリンク情報の取得（クライアントとの通信用）<br>
	 */
	abstract public class Srch08 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch08";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0020.DblinkR down0;
		
		
		// コンストラクタ
		protected Srch08() {
			
			// このオペレーションのコンテナ初期化
			down0 = mcframe.serverMAUC.MAUCL0020.DblinkR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_AppSys)MAUCL_AppSys_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DblinkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0020.DblinkR createDblinkR(){
			return mcframe.serverMAUC.MAUCL0020.DblinkR.create();
		}

		//-------------------------外部 I/F--------------------------

		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>db.dblink_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL0020.DblinkR
		 */
		public mcframe.serverMAUC.MAUCL0020.DblinkR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_AppSys)MAUCL_AppSys_MC_A.this).info;
		}


	}
	/**
	 * Srch09オペレーション.<p>
	 *
	 * 原価会社パラメータ情報の取得（クライアントとの通信用）<br>
	 */
	abstract public class Srch09 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch09";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0020.CoParmR down0;
		
		
		// コンストラクタ
		protected Srch09() {
			
			// このオペレーションのコンテナ初期化
			down0 = mcframe.serverMAUC.MAUCL0020.CoParmR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_AppSys)MAUCL_AppSys_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CoParmブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0020.CoParmR createCoParmR(){
			return mcframe.serverMAUC.MAUCL0020.CoParmR.create();
		}

		//-------------------------外部 I/F--------------------------

		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>co.std_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>co.std_dec_place</td></tr>
		 * 	<tr><td><br></td><td>co.amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>co.amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>co.ave_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>co.ave_dec_place</td></tr>
		 * 	<tr><td><br></td><td>co.adj_typ</td></tr>
		 * 	<tr><td><br></td><td>co.mrgn_expns_cd</td></tr>
		 * 	<tr><td><br></td><td>co.purc_expns_cd</td></tr>
		 * 	<tr><td><br></td><td>co.out_expns_cd</td></tr>
		 * 	<tr><td><br></td><td>co.inpt_expns_cd</td></tr>
		 * 	<tr><td><br></td><td>co.ss_expns_cd</td></tr>
		 * 	<tr><td><br></td><td>co.prov_expns_cd</td></tr>
		 * 	<tr><td><br></td><td>co.diff_use_typ</td></tr>
		 * 	<tr><td><br></td><td>co.def_calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>co.amt_disp_digit</td></tr>
		 * 	<tr><td><br></td><td>co.unit_disp_digit</td></tr>
		 * 	<tr><td><br></td><td>co.std_disp_digit</td></tr>
		 * 	<tr><td><br></td><td>co.rate_disp_digit</td></tr>
		 * 	<tr><td><br></td><td>co.excel_pln_flg</td></tr>
		 * 	<tr><td><br></td><td>co.excel_act_flg</td></tr>
		 * 	<tr><td><br></td><td>co.excel_alc_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL0020.CoParmR
		 */
		public mcframe.serverMAUC.MAUCL0020.CoParmR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_AppSys)MAUCL_AppSys_MC_A.this).info;
		}


	}
	/**
	 * Srch10オペレーション.<p>
	 *
	 * ログインユーザ担当者権限マスタ取得（クライアントとの通信用）<br>
	 */
	abstract public class Srch10 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch10";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL0020.UsrAclR down0;
		
		
		// コンストラクタ
		protected Srch10() {
			
			// このオペレーションのコンテナ初期化
			down0 = mcframe.serverMAUC.MAUCL0020.UsrAclR.create();

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MAUCL_AppSys)MAUCL_AppSys_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * UsrAclブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL0020.UsrAclR createUsrAclR(){
			return mcframe.serverMAUC.MAUCL0020.UsrAclR.create();
		}

		//-------------------------外部 I/F--------------------------

		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>usr.usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr.st_dt</td></tr>
		 * 	<tr><td><br></td><td>usr.end_dt</td></tr>
		 * 	<tr><td><br></td><td>usr.da_cd</td></tr>
		 * 	<tr><td><br></td><td>usr.pre_cl_usr_flg</td></tr>
		 * 	<tr><td><br></td><td>usr.dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>usr.add_dpt_cd1</td></tr>
		 * 	<tr><td><br></td><td>usr.add_dpt_cd2</td></tr>
		 * 	<tr><td><br></td><td>usr.add_dpt_cd3</td></tr>
		 * 	<tr><td><br></td><td>usr.add_dpt_cd4</td></tr>
		 * 	<tr><td><br></td><td>usr.add_dpt_cd5</td></tr>
		 * 	<tr><td><br></td><td>usr.add_dpt_cd6</td></tr>
		 * 	<tr><td><br></td><td>usr.add_dpt_cd7</td></tr>
		 * 	<tr><td><br></td><td>usr.add_dpt_cd8</td></tr>
		 * 	<tr><td><br></td><td>usr.add_dpt_cd9</td></tr>
		 * 	<tr><td><br></td><td>usr.aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>usr.aprv_role_cd1</td></tr>
		 * 	<tr><td><br></td><td>usr.aprv_role_cd2</td></tr>
		 * 	<tr><td><br></td><td>usr.aprv_role_cd3</td></tr>
		 * 	<tr><td><br></td><td>usr.aprv_role_cd4</td></tr>
		 * 	<tr><td><br></td><td>usr.aprv_role_cd5</td></tr>
		 * 	<tr><td><br></td><td>usr.aprv_role_cd6</td></tr>
		 * 	<tr><td><br></td><td>usr.aprv_role_cd7</td></tr>
		 * 	<tr><td><br></td><td>usr.aprv_role_cd8</td></tr>
		 * 	<tr><td><br></td><td>usr.aprv_role_cd9</td></tr>
		 * 	<tr><td><br></td><td>usr.sub_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>usr.sub_aprv_role_cd1</td></tr>
		 * 	<tr><td><br></td><td>usr.sub_aprv_role_cd2</td></tr>
		 * 	<tr><td><br></td><td>usr.sub_aprv_role_cd3</td></tr>
		 * 	<tr><td><br></td><td>usr.sub_aprv_role_cd4</td></tr>
		 * 	<tr><td><br></td><td>usr.sub_aprv_role_cd5</td></tr>
		 * 	<tr><td><br></td><td>usr.sub_aprv_role_cd6</td></tr>
		 * 	<tr><td><br></td><td>usr.sub_aprv_role_cd7</td></tr>
		 * 	<tr><td><br></td><td>usr.sub_aprv_role_cd8</td></tr>
		 * 	<tr><td><br></td><td>usr.sub_aprv_role_cd9</td></tr>
		 * 	<tr><td><br></td><td>usr.cl_usr_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL0020.UsrAclR
		 */
		public mcframe.serverMAUC.MAUCL0020.UsrAclR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_AppSys)MAUCL_AppSys_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}