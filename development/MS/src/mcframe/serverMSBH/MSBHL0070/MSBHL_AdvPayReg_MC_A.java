package mcframe.serverMSBH.MSBHL0070;

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
 * "MSBHL_AdvPayReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_AdvPayReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBH";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBHL0070";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_AdvPayReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBHL0070_Srch01_INFO;
		this.aSrch01 = ((MSBHL_AdvPayReg)this).new Srch01();
	}

	public static MSBHL_AdvPayReg.Srch01 crtSrch01() {
		MSBHL_AdvPayReg lgc = new MSBHL_AdvPayReg();
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
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0070.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBH.MSBHL0070.Srch01_CndR.create();
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0070.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMSBH.MSBHL0070.Srch01_HdrR.create();
	}
	protected MSBHL_AdvPayReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBHL0070_Ins01_INFO;
		this.aIns01 = ((MSBHL_AdvPayReg)this).new Ins01();
	}

	public static MSBHL_AdvPayReg.Ins01 crtIns01() {
		MSBHL_AdvPayReg lgc = new MSBHL_AdvPayReg();
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

	/**
	 * Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR createIns01_HdrR(){
		return mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.create();
	}
	protected MSBHL_AdvPayReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBHL0070_Upd01_INFO;
		this.aUpd01 = ((MSBHL_AdvPayReg)this).new Upd01();
	}

	public static MSBHL_AdvPayReg.Upd01 crtUpd01() {
		MSBHL_AdvPayReg lgc = new MSBHL_AdvPayReg();
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

	/**
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.create();
	}
	protected MSBHL_AdvPayReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBHL0070_Del01_INFO;
		this.aDel01 = ((MSBHL_AdvPayReg)this).new Del01();
	}

	public static MSBHL_AdvPayReg.Del01 crtDel01() {
		MSBHL_AdvPayReg lgc = new MSBHL_AdvPayReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR createDel01_HdrR(){
		return mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 前渡金実績、支払手形情報を検索する。<br>
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
		private final mcframe.serverMSBH.MSBHL0070.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0070.Srch01_HdrR down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0070.Srch01_CndR.create();
			down0 = mcframe.serverMSBH.MSBHL0070.Srch01_HdrR.create();

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
			invoke((MSBHL_AdvPayReg)MSBHL_AdvPayReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0070.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBH.MSBHL0070.Srch01_CndR.create();
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0070.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMSBH.MSBHL0070.Srch01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0070.Srch01_CndR
		 */
		public mcframe.serverMSBH.MSBHL0070.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_nm</td></tr>
		 * 	<tr><td><br></td><td>psppl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_setoff_tgt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_setoff_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_setoff_act_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_not_proc_bal</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_adv_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>com_paid_ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>com_paid_ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>com_paid_ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>com_paid_ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>note_typ</td></tr>
		 * 	<tr><td><br></td><td>note_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_dt</td></tr>
		 * 	<tr><td><br></td><td>note_days</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>endrsr</td></tr>
		 * 	<tr><td><br></td><td>accptr</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_nm</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>note_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0070.Srch01_HdrR
		 */
		public mcframe.serverMSBH.MSBHL0070.Srch01_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_AdvPayReg)MSBHL_AdvPayReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 前渡金実績、支払手形情報を新規登録する。<br>
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
		private final mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR down0;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.create();
			down0 = mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.create();

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
			invoke((MSBHL_AdvPayReg)MSBHL_AdvPayReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR createIns01_HdrR(){
			return mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>apa.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>apa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.xrate</td></tr>
		 * 	<tr><td><br></td><td>apa.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.com_paid_ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_ntc_adv_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>apa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pn.note_no</td></tr>
		 * 	<tr><td><br></td><td>pn.note_typ</td></tr>
		 * 	<tr><td><br></td><td>pn.note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_dt</td></tr>
		 * 	<tr><td><br></td><td>pn.due_dt</td></tr>
		 * 	<tr><td><br></td><td>pn.note_days</td></tr>
		 * 	<tr><td><br></td><td>pn.drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.endrsr</td></tr>
		 * 	<tr><td><br></td><td>pn.accptr</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR
		 */
		public mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>apa.ac_ym</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR
		 */
		public mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_AdvPayReg)MSBHL_AdvPayReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 前渡金実績、支払手形情報を更新する。<br>
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
		private final mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR down0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.create();
			down0 = mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.create();

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
			invoke((MSBHL_AdvPayReg)MSBHL_AdvPayReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>apa.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>apa.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.xrate</td></tr>
		 * 	<tr><td><br></td><td>apa.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.com_paid_ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>apa.pay_ntc_adv_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>apa.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>apa.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>apa.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pn.note_no</td></tr>
		 * 	<tr><td><br></td><td>pn.note_typ</td></tr>
		 * 	<tr><td><br></td><td>pn.note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_dt</td></tr>
		 * 	<tr><td><br></td><td>pn.due_dt</td></tr>
		 * 	<tr><td><br></td><td>pn.note_days</td></tr>
		 * 	<tr><td><br></td><td>pn.drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>pn.endrsr</td></tr>
		 * 	<tr><td><br></td><td>pn.accptr</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pn.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR
		 */
		public mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>apa.ac_ym</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR
		 */
		public mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_AdvPayReg)MSBHL_AdvPayReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 前渡金実績、支払手形情報を取り消す。<br>
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
		private final mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR up0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_AdvPayReg)MSBHL_AdvPayReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR createDel01_HdrR(){
			return mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>apa.adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR
		 */
		public mcframe.serverMSBH.MSBHL5050.AdvPay_Chk01_HdrR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_AdvPayReg)MSBHL_AdvPayReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}