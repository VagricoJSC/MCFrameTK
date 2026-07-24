package mcframe.serverMSBG.MSBGL0160;

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
 * "MSBGL_RcvDivReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGL_RcvDivReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBGL0160";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGL_RcvDivReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBGL0160_Srch01_INFO;
		this.aSrch01 = ((MSBGL_RcvDivReg)this).new Srch01();
	}

	public static MSBGL_RcvDivReg.Srch01 crtSrch01() {
		MSBGL_RcvDivReg lgc = new MSBGL_RcvDivReg();
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
		p.addDownBlock(aSrch01.down1());
		p.addDownBlock(aSrch01.down2());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0160.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBG.MSBGL0160.Srch01_CndR.create();
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0160.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMSBG.MSBGL0160.Srch01_HdrR.create();
	}

	/**
	 * Srch01_RcvDivブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0160.Srch01_RcvDivR createSrch01_RcvDivR(){
		return mcframe.serverMSBG.MSBGL0160.Srch01_RcvDivR.create();
	}

	/**
	 * Srch01_RcvDivブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL0160.Srch01_RcvDivR> createSrch01_RcvDivL(){
		return MCList.create(mcframe.serverMSBG.MSBGL0160.Srch01_RcvDivR.class);
	}

	/**
	 * Srch01_RcvSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0160.Srch01_RcvSchdR createSrch01_RcvSchdR(){
		return mcframe.serverMSBG.MSBGL0160.Srch01_RcvSchdR.create();
	}

	/**
	 * Srch01_RcvSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL0160.Srch01_RcvSchdR> createSrch01_RcvSchdL(){
		return MCList.create(mcframe.serverMSBG.MSBGL0160.Srch01_RcvSchdR.class);
	}
	protected MSBGL_RcvDivReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBGL0160_Chk01_INFO;
		this.aChk01 = ((MSBGL_RcvDivReg)this).new Chk01();
	}

	public static MSBGL_RcvDivReg.Chk01 crtChk01() {
		MSBGL_RcvDivReg lgc = new MSBGL_RcvDivReg();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addUpBlock(aChk01.up1());
		p.addDownBlock(aChk01.down0());
		p.addDownBlock(aChk01.down1());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0160.HdrR createHdrR(){
		return mcframe.serverMSBG.MSBGL0160.HdrR.create();
	}

	/**
	 * RcvDivブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0160.RcvDivR createRcvDivR(){
		return mcframe.serverMSBG.MSBGL0160.RcvDivR.create();
	}

	/**
	 * RcvDivブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL0160.RcvDivR> createRcvDivL(){
		return MCList.create(mcframe.serverMSBG.MSBGL0160.RcvDivR.class);
	}
	protected MSBGL_RcvDivReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBGL0160_Upd01_INFO;
		this.aUpd01 = ((MSBGL_RcvDivReg)this).new Upd01();
	}

	public static MSBGL_RcvDivReg.Upd01 crtUpd01() {
		MSBGL_RcvDivReg lgc = new MSBGL_RcvDivReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addUpBlock(aUpd01.up1());
		p.addDownBlock(aUpd01.down0());
		p.addDownBlock(aUpd01.down1());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0160.HdrR createUpd01_HdrR(){
		return mcframe.serverMSBG.MSBGL0160.HdrR.create();
	}

	/**
	 * Upd01_RcvDivブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0160.RcvDivR createUpd01_RcvDivR(){
		return mcframe.serverMSBG.MSBGL0160.RcvDivR.create();
	}

	/**
	 * Upd01_RcvDivブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL0160.RcvDivR> createUpd01_RcvDivL(){
		return MCList.create(mcframe.serverMSBG.MSBGL0160.RcvDivR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 分割元の入金、入金予定情報を検索する。<br>
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
		private final mcframe.serverMSBG.MSBGL0160.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0160.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL0160.Srch01_RcvDivR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL0160.Srch01_RcvSchdR> down2;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGL0160.Srch01_CndR.create();
			down0 = mcframe.serverMSBG.MSBGL0160.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBG.MSBGL0160.Srch01_RcvDivR.class);
			down2 = MCList.create(mcframe.serverMSBG.MSBGL0160.Srch01_RcvSchdR.class);

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
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_RcvDivReg)MSBGL_RcvDivReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0160.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBG.MSBGL0160.Srch01_CndR.create();
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0160.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMSBG.MSBGL0160.Srch01_HdrR.create();
		}

		/**
		 * Srch01_RcvDivブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0160.Srch01_RcvDivR createSrch01_RcvDivR(){
			return mcframe.serverMSBG.MSBGL0160.Srch01_RcvDivR.create();
		}

		/**
		 * Srch01_RcvDivブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL0160.Srch01_RcvDivR> createSrch01_RcvDivL(){
			return MCList.create(mcframe.serverMSBG.MSBGL0160.Srch01_RcvDivR.class);
		}

		/**
		 * Srch01_RcvSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0160.Srch01_RcvSchdR createSrch01_RcvSchdR(){
			return mcframe.serverMSBG.MSBGL0160.Srch01_RcvSchdR.create();
		}

		/**
		 * Srch01_RcvSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL0160.Srch01_RcvSchdR> createSrch01_RcvSchdL(){
			return MCList.create(mcframe.serverMSBG.MSBGL0160.Srch01_RcvSchdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>inc_not_cl_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0160.Srch01_CndR
		 */
		public mcframe.serverMSBG.MSBGL0160.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>div_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>not_proc_bal</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_nm</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>rcv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rcv_auto_appl_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>com_paid</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_sts_typ_nm</td></tr>
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
		 * 	<tr><td><br></td><td>note_mng_no</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>note_typ</td></tr>
		 * 	<tr><td><br></td><td>note_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_dt</td></tr>
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
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcv_dat_typ</td></tr>
		 * 	<tr><td><br></td><td>div_src_rcv_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0160.Srch01_HdrR
		 */
		public mcframe.serverMSBG.MSBGL0160.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>not_proc_bal</td></tr>
		 * 	<tr><td><br></td><td>com_paid</td></tr>
		 * 	<tr><td><br></td><td>rcv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>div_src_rcv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL0160.Srch01_RcvDivR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL0160.Srch01_RcvSchdR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvDivReg)MSBGL_RcvDivReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 更新前のチェックを行う。<br>
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
		private final mcframe.serverMSBG.MSBGL0160.HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL0160.RcvDivR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0160.HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL0160.RcvDivR> down1;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGL0160.HdrR.create();
			up1 = MCList.create(mcframe.serverMSBG.MSBGL0160.RcvDivR.class);
			down0 = mcframe.serverMSBG.MSBGL0160.HdrR.create();
			down1 = MCList.create(mcframe.serverMSBG.MSBGL0160.RcvDivR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_RcvDivReg)MSBGL_RcvDivReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0160.HdrR createHdrR(){
			return mcframe.serverMSBG.MSBGL0160.HdrR.create();
		}

		/**
		 * RcvDivブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0160.RcvDivR createRcvDivR(){
			return mcframe.serverMSBG.MSBGL0160.RcvDivR.create();
		}

		/**
		 * RcvDivブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL0160.RcvDivR> createRcvDivL(){
			return MCList.create(mcframe.serverMSBG.MSBGL0160.RcvDivR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0160.HdrR
		 */
		public mcframe.serverMSBG.MSBGL0160.HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>not_proc_bal</td></tr>
		 * 	<tr><td><br></td><td>com_paid</td></tr>
		 * 	<tr><td><br></td><td>rcv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>div_src_rcv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL0160.RcvDivR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0160.HdrR
		 */
		public mcframe.serverMSBG.MSBGL0160.HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>com_paid</td></tr>
		 * 	<tr><td><br></td><td>rcv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL0160.RcvDivR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvDivReg)MSBGL_RcvDivReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 入金を分割する。<br>
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
		private final mcframe.serverMSBG.MSBGL0160.HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL0160.RcvDivR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0160.HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL0160.RcvDivR> down1;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGL0160.HdrR.create();
			up1 = MCList.create(mcframe.serverMSBG.MSBGL0160.RcvDivR.class);
			down0 = mcframe.serverMSBG.MSBGL0160.HdrR.create();
			down1 = MCList.create(mcframe.serverMSBG.MSBGL0160.RcvDivR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_RcvDivReg)MSBGL_RcvDivReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0160.HdrR createUpd01_HdrR(){
			return mcframe.serverMSBG.MSBGL0160.HdrR.create();
		}

		/**
		 * Upd01_RcvDivブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0160.RcvDivR createUpd01_RcvDivR(){
			return mcframe.serverMSBG.MSBGL0160.RcvDivR.create();
		}

		/**
		 * Upd01_RcvDivブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL0160.RcvDivR> createUpd01_RcvDivL(){
			return MCList.create(mcframe.serverMSBG.MSBGL0160.RcvDivR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0160.HdrR
		 */
		public mcframe.serverMSBG.MSBGL0160.HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>not_proc_bal</td></tr>
		 * 	<tr><td><br></td><td>com_paid</td></tr>
		 * 	<tr><td><br></td><td>rcv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>div_src_rcv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL0160.RcvDivR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>not_proc_bal</td></tr>
		 * 	<tr><td><br></td><td>div_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0160.HdrR
		 */
		public mcframe.serverMSBG.MSBGL0160.HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL0160.RcvDivR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_RcvDivReg)MSBGL_RcvDivReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}