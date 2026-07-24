package mcframe.serverMSBG.MSBGL0150;

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
 * "MSBGL_NotApplSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGL_NotApplSrch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBGL0150";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGL_NotApplSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBGL0150_Srch01_INFO;
		this.aSrch01 = ((MSBGL_NotApplSrch)this).new Srch01();
	}

	public static MSBGL_NotApplSrch.Srch01 crtSrch01() {
		MSBGL_NotApplSrch lgc = new MSBGL_NotApplSrch();
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
	public mcframe.serverMSBG.MSBGL0150.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBG.MSBGL0150.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0150.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBG.MSBGL0150.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL0150.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBG.MSBGL0150.Srch01_RsltR.class);
	}
	protected MSBGL_NotApplSrch.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBGL0150_Prnt01_INFO;
		this.aPrnt01 = ((MSBGL_NotApplSrch)this).new Prnt01();
	}

	public static MSBGL_NotApplSrch.Prnt01 crtPrnt01() {
		MSBGL_NotApplSrch lgc = new MSBGL_NotApplSrch();
		lgc.initPrnt01();
		return lgc.aPrnt01;
	}

	protected void paramPrnt01(MCParam p) {
		if (this.aPrnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt01.up0());
		p.addUpBlock(aPrnt01.up1());
		p.addDownBlock(aPrnt01.down0());
	}

	protected void doPrnt01() {
		aPrnt01.call();
	};

	/**
	 * Prnt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0150.Prnt01_CndR createPrnt01_CndR(){
		return mcframe.serverMSBG.MSBGL0150.Prnt01_CndR.create();
	}

	/**
	 * Prnt01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL0150.Prnt01_CndR> createPrnt01_CndL(){
		return MCList.create(mcframe.serverMSBG.MSBGL0150.Prnt01_CndR.class);
	}

	/**
	 * Prnt01_RCndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0150.Prnt01_RCndR createPrnt01_RCndR(){
		return mcframe.serverMSBG.MSBGL0150.Prnt01_RCndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 未処理の入金情報を検索する<br>
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
		private final mcframe.serverMSBG.MSBGL0150.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL0150.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGL0150.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBG.MSBGL0150.Srch01_RsltR.class);

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
			invoke((MSBGL_NotApplSrch)MSBGL_NotApplSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0150.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBG.MSBGL0150.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0150.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBG.MSBGL0150.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL0150.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBG.MSBGL0150.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>scr_ope_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>susp_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_flg</td></tr>
		 * 	<tr><td><br></td><td>not_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>fb_t_flg</td></tr>
		 * 	<tr><td><br></td><td>fb_f_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt_to</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_nm</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>if_rcv_no</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>proc_flg</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0150.Srch01_CndR
		 */
		public mcframe.serverMSBG.MSBGL0150.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_dat_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_dat_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>xfr_psn</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>not_proc_bal</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_nm</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>auto_appl_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>div_flg</td></tr>
		 * 	<tr><td><br></td><td>div_src_rcv_no</td></tr>
		 * 	<tr><td><br></td><td>src_rcv_act_no</td></tr>
		 * 	<tr><td><br></td><td>if_rcv_no</td></tr>
		 * 	<tr><td><br></td><td>fb_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_rcv_no</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>rcv_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bill_grp_nm10</td></tr>
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
		public MCList<mcframe.serverMSBG.MSBGL0150.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_NotApplSrch)MSBGL_NotApplSrch_MC_A.this).info;
		}


	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 入金管理票を印刷する<br>
	 */
	abstract public class Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL0150.Prnt01_CndR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0150.Prnt01_RCndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL0150.Prnt01_CndR> down0;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL0150.Prnt01_CndR.class);
			up1 = mcframe.serverMSBG.MSBGL0150.Prnt01_RCndR.create();
			down0 = MCList.create(mcframe.serverMSBG.MSBGL0150.Prnt01_CndR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_NotApplSrch)MSBGL_NotApplSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0150.Prnt01_CndR createPrnt01_CndR(){
			return mcframe.serverMSBG.MSBGL0150.Prnt01_CndR.create();
		}

		/**
		 * Prnt01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL0150.Prnt01_CndR> createPrnt01_CndL(){
			return MCList.create(mcframe.serverMSBG.MSBGL0150.Prnt01_CndR.class);
		}

		/**
		 * Prnt01_RCndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0150.Prnt01_RCndR createPrnt01_RCndR(){
			return mcframe.serverMSBG.MSBGL0150.Prnt01_RCndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcv_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL0150.Prnt01_CndR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0150.Prnt01_RCndR
		 */
		public mcframe.serverMSBG.MSBGL0150.Prnt01_RCndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL0150.Prnt01_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_NotApplSrch)MSBGL_NotApplSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}