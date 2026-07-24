package mcframe.serverMSBD.MSBDL0130;

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
 * "MSBDL_PurcListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDL_PurcListReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBDL0130";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBDL_PurcListReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBDL0130_Chk01_INFO;
		this.aChk01 = ((MSBDL_PurcListReg)this).new Chk01();
	}

	public static MSBDL_PurcListReg.Chk01 crtChk01() {
		MSBDL_PurcListReg lgc = new MSBDL_PurcListReg();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addDownBlock(aChk01.down0());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0130.RsltR createRsltR(){
		return mcframe.serverMSBD.MSBDL0130.RsltR.create();
	}

	/**
	 * RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> createRsltL(){
		return MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);
	}
	protected MSBDL_PurcListReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBDL0130_Ins01_INFO;
		this.aIns01 = ((MSBDL_PurcListReg)this).new Ins01();
	}

	public static MSBDL_PurcListReg.Ins01 crtIns01() {
		MSBDL_PurcListReg lgc = new MSBDL_PurcListReg();
		lgc.initIns01();
		return lgc.aIns01;
	}

	protected void paramIns01(MCParam p) {
		if (this.aIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns01.up0());
		p.addDownBlock(aIns01.down0());
	}

	protected void doIns01() {
		aIns01.call();
	};
	protected MSBDL_PurcListReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBDL0130_Upd01_INFO;
		this.aUpd01 = ((MSBDL_PurcListReg)this).new Upd01();
	}

	public static MSBDL_PurcListReg.Upd01 crtUpd01() {
		MSBDL_PurcListReg lgc = new MSBDL_PurcListReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addDownBlock(aUpd01.down0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};
	protected MSBDL_PurcListReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBDL0130_Del01_INFO;
		this.aDel01 = ((MSBDL_PurcListReg)this).new Del01();
	}

	public static MSBDL_PurcListReg.Del01 crtDel01() {
		MSBDL_PurcListReg lgc = new MSBDL_PurcListReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
		p.addDownBlock(aDel01.down0());
	}

	protected void doDel01() {
		aDel01.call();
	};
	protected MSBDL_PurcListReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBDL0130_Srch01_INFO;
		this.aSrch01 = ((MSBDL_PurcListReg)this).new Srch01();
	}

	public static MSBDL_PurcListReg.Srch01 crtSrch01() {
		MSBDL_PurcListReg lgc = new MSBDL_PurcListReg();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL0130.CndR createCndR(){
		return mcframe.serverMSBD.MSBDL0130.CndR.create();
	}
	protected MSBDL_PurcListReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBDL0130_Srch02_INFO;
		this.aSrch02 = ((MSBDL_PurcListReg)this).new Srch02();
	}

	public static MSBDL_PurcListReg.Srch02 crtSrch02() {
		MSBDL_PurcListReg lgc = new MSBDL_PurcListReg();
		lgc.initSrch02();
		return lgc.aSrch02;
	}

	protected void paramSrch02(MCParam p) {
		if (this.aSrch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch02.up0());
		p.addDownBlock(aSrch02.down0());
	}

	protected void doSrch02() {
		aSrch02.call();
	};
	protected MSBDL_PurcListReg.Srch03 aSrch03;

	protected void initSrch03() {
		this.info = PDef.MS_MSBDL0130_Srch03_INFO;
		this.aSrch03 = ((MSBDL_PurcListReg)this).new Srch03();
	}

	public static MSBDL_PurcListReg.Srch03 crtSrch03() {
		MSBDL_PurcListReg lgc = new MSBDL_PurcListReg();
		lgc.initSrch03();
		return lgc.aSrch03;
	}

	protected void paramSrch03(MCParam p) {
		if (this.aSrch03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch03.up0());
		p.addDownBlock(aSrch03.down0());
	}

	protected void doSrch03() {
		aSrch03.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 仕入実績の登録、訂正、取消前のチェックを行う。<br>
	 */
	abstract public class Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0130.RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0130.RsltR> down0;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);

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
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcListReg)MSBDL_PurcListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0130.RsltR createRsltR(){
			return mcframe.serverMSBD.MSBDL0130.RsltR.create();
		}

		/**
		 * RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> createRsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_split_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>slip_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>multi_io_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>msg_id</td></tr>
		 * 	<tr><td><br></td><td>msg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_split_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>purc_prgrs</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_arr_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_purc_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_accpt_dfct_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_site_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_sppl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>outsrc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm_bp</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm_bp</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>slip_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>mst_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>po_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcListReg)MSBDL_PurcListReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 仕入実績を登録する。<br>
	 */
	abstract public class Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0130.RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0130.RsltR> down0;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);

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
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcListReg)MSBDL_PurcListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0130.RsltR createRsltR(){
			return mcframe.serverMSBD.MSBDL0130.RsltR.create();
		}

		/**
		 * RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> createRsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_split_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>slip_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>tmp_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>tmp_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>msg_id</td></tr>
		 * 	<tr><td><br></td><td>msg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcListReg)MSBDL_PurcListReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 仕入実績を訂正する。<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0130.RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0130.RsltR> down0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);

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
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcListReg)MSBDL_PurcListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0130.RsltR createRsltR(){
			return mcframe.serverMSBD.MSBDL0130.RsltR.create();
		}

		/**
		 * RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> createRsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_split_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>slip_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>multi_io_flg</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>msg_id</td></tr>
		 * 	<tr><td><br></td><td>msg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcListReg)MSBDL_PurcListReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 仕入実績を取り消す。<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0130.RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0130.RsltR> down0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);

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
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcListReg)MSBDL_PurcListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0130.RsltR createRsltR(){
			return mcframe.serverMSBD.MSBDL0130.RsltR.create();
		}

		/**
		 * RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> createRsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>msg_id</td></tr>
		 * 	<tr><td><br></td><td>msg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcListReg)MSBDL_PurcListReg_MC_A.this).info;
		}


	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 仕入予定を検索する。<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
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
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0130.CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0130.RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL0130.CndR.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);

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
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcListReg)MSBDL_PurcListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0130.CndR createCndR(){
			return mcframe.serverMSBD.MSBDL0130.CndR.create();
		}

		/**
		 * RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0130.RsltR createRsltR(){
			return mcframe.serverMSBD.MSBDL0130.RsltR.create();
		}

		/**
		 * RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> createRsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>mode</td></tr>
		 * 	<tr><td><br></td><td>arr_flg</td></tr>
		 * 	<tr><td><br></td><td>not_yet_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_flg</td></tr>
		 * 	<tr><td><br></td><td>not_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>not_edi_flg</td></tr>
		 * 	<tr><td><br></td><td>incl_not_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_prgrs_fr</td></tr>
		 * 	<tr><td><br></td><td>purc_prgrs_to</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>arr_done_not_insp_fin_flg</td></tr>
		 * 	<tr><td><br></td><td>dfct_insp_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0130.CndR
		 */
		public mcframe.serverMSBD.MSBDL0130.CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>par_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_split_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>src_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_prgrs</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_purc_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_accpt_dfct_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>outsrc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>scst_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>slip_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>mst_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>po_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>po_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcListReg)MSBDL_PurcListReg_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 仕入実績を検索する。<br>
	 */
	abstract public class Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
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
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0130.CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0130.RsltR> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL0130.CndR.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);

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
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcListReg)MSBDL_PurcListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0130.CndR createCndR(){
			return mcframe.serverMSBD.MSBDL0130.CndR.create();
		}

		/**
		 * RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0130.RsltR createRsltR(){
			return mcframe.serverMSBD.MSBDL0130.RsltR.create();
		}

		/**
		 * RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> createRsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>mode</td></tr>
		 * 	<tr><td><br></td><td>expt_unplan_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_flg</td></tr>
		 * 	<tr><td><br></td><td>not_yet_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_flg</td></tr>
		 * 	<tr><td><br></td><td>not_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>not_edi_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>purc_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>purc_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_to</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_prgrs_fr</td></tr>
		 * 	<tr><td><br></td><td>purc_prgrs_to</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>arr_done_not_insp_fin_flg</td></tr>
		 * 	<tr><td><br></td><td>dfct_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>incl_temp_ap_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0130.CndR
		 */
		public mcframe.serverMSBD.MSBDL0130.CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>par_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_split_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>src_wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>src_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>src_inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_prgrs</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty_bef</td></tr>
		 * 	<tr><td><br></td><td>base_unit_purc_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>outsrc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>scst_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>slip_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dtl_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>mst_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>po_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>multi_io_flg</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_purc_act_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcListReg)MSBDL_PurcListReg_MC_A.this).info;
		}


	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 仕入実績登録対象の仕入予定、入荷実績を検索する。<br>
	 */
	abstract public class Srch03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
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
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL0130.CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL0130.RsltR> down0;
		
		
		// コンストラクタ
		protected Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL0130.CndR.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);

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
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcListReg)MSBDL_PurcListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0130.CndR createCndR(){
			return mcframe.serverMSBD.MSBDL0130.CndR.create();
		}

		/**
		 * RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL0130.RsltR createRsltR(){
			return mcframe.serverMSBD.MSBDL0130.RsltR.create();
		}

		/**
		 * RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> createRsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL0130.RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>mode</td></tr>
		 * 	<tr><td><br></td><td>arr_flg</td></tr>
		 * 	<tr><td><br></td><td>not_yet_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_flg</td></tr>
		 * 	<tr><td><br></td><td>not_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>not_edi_flg</td></tr>
		 * 	<tr><td><br></td><td>incl_not_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_prgrs_fr</td></tr>
		 * 	<tr><td><br></td><td>purc_prgrs_to</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>arr_done_not_insp_fin_flg</td></tr>
		 * 	<tr><td><br></td><td>dfct_insp_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL0130.CndR
		 */
		public mcframe.serverMSBD.MSBDL0130.CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>po_schd_src_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>from_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>par_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_split_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>src_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>src_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>src_wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>src_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>src_inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_prgrs</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty_bef</td></tr>
		 * 	<tr><td><br></td><td>base_unit_purc_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_site_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>re_arr_loc_sppl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_re_arr_qty</td></tr>
		 * 	<tr><td><br></td><td>re_arr_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>re_arr_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ncv_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>outsrc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>drct_dlv_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>scst_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>slip_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>mst_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>s_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>edi_bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ap_cred_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_purc_act_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL0130.RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcListReg)MSBDL_PurcListReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}