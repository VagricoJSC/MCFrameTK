package mcframe.serverMSBB.MSBBL1420;

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
 * "MSBBL_SlsSlipPrnt"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBL_SlsSlipPrnt_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBBL1420";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBL_SlsSlipPrnt.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBBL1420_Srch01_INFO;
		this.aSrch01 = ((MSBBL_SlsSlipPrnt)this).new Srch01();
	}

	public static MSBBL_SlsSlipPrnt.Srch01 crtSrch01() {
		MSBBL_SlsSlipPrnt lgc = new MSBBL_SlsSlipPrnt();
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
	public mcframe.serverMSBB.MSBBL1420.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBB.MSBBL1420.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1420.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBB.MSBBL1420.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1420.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1420.Srch01_RsltR.class);
	}
	protected MSBBL_SlsSlipPrnt.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBBL1420_Prnt01_INFO;
		this.aPrnt01 = ((MSBBL_SlsSlipPrnt)this).new Prnt01();
	}

	public static MSBBL_SlsSlipPrnt.Prnt01 crtPrnt01() {
		MSBBL_SlsSlipPrnt lgc = new MSBBL_SlsSlipPrnt();
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
	 * Prnt01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1420.Prnt01_RsltR createPrnt01_RsltR(){
		return mcframe.serverMSBB.MSBBL1420.Prnt01_RsltR.create();
	}

	/**
	 * Prnt01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1420.Prnt01_RsltR> createPrnt01_RsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1420.Prnt01_RsltR.class);
	}

	/**
	 * Prnt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1420.Prnt01_CndR createPrnt01_CndR(){
		return mcframe.serverMSBB.MSBBL1420.Prnt01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売上実績を検索する<br>
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
		private final mcframe.serverMSBB.MSBBL1420.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1420.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1420.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1420.Srch01_RsltR.class);

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
			invoke((MSBBL_SlsSlipPrnt)MSBBL_SlsSlipPrnt_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1420.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBB.MSBBL1420.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1420.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBB.MSBBL1420.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1420.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1420.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>sls_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_to</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>inv_can_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1420.Srch01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1420.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>cst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>dlv_grp_nm10</td></tr>
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
		public MCList<mcframe.serverMSBB.MSBBL1420.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsSlipPrnt)MSBBL_SlsSlipPrnt_MC_A.this).info;
		}


	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 売上伝票を発行する<br>
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
		private final MCList<mcframe.serverMSBB.MSBBL1420.Prnt01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1420.Prnt01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1420.Prnt01_RsltR> down0;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL1420.Prnt01_RsltR.class);
			up1 = mcframe.serverMSBB.MSBBL1420.Prnt01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1420.Prnt01_RsltR.class);

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
			invoke((MSBBL_SlsSlipPrnt)MSBBL_SlsSlipPrnt_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Prnt01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1420.Prnt01_RsltR createPrnt01_RsltR(){
			return mcframe.serverMSBB.MSBBL1420.Prnt01_RsltR.create();
		}

		/**
		 * Prnt01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1420.Prnt01_RsltR> createPrnt01_RsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1420.Prnt01_RsltR.class);
		}

		/**
		 * Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1420.Prnt01_CndR createPrnt01_CndR(){
			return mcframe.serverMSBB.MSBBL1420.Prnt01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1420.Prnt01_RsltR> up0() {
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
		 * @see mcframe.serverMSBB.MSBBL1420.Prnt01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1420.Prnt01_CndR up1() {
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
		public MCList<mcframe.serverMSBB.MSBBL1420.Prnt01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsSlipPrnt)MSBBL_SlsSlipPrnt_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}