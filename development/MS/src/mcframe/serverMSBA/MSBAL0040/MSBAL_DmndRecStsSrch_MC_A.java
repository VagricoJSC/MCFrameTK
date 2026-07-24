package mcframe.serverMSBA.MSBAL0040;

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
 * "MSBAL_DmndRecStsSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBAL_DmndRecStsSrch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBAL0040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBAL_DmndRecStsSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBAL0040_Srch01_INFO;
		this.aSrch01 = ((MSBAL_DmndRecStsSrch)this).new Srch01();
	}

	public static MSBAL_DmndRecStsSrch.Srch01 crtSrch01() {
		MSBAL_DmndRecStsSrch lgc = new MSBAL_DmndRecStsSrch();
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
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL0040.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBA.MSBAL0040.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL0040.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMSBA.MSBAL0040.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL0040.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMSBA.MSBAL0040.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL0040.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMSBA.MSBAL0040.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL0040.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMSBA.MSBAL0040.Srch01_Rslt2R.class);
	}
	protected MSBAL_DmndRecStsSrch.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBAL0040_Srch02_INFO;
		this.aSrch02 = ((MSBAL_DmndRecStsSrch)this).new Srch02();
	}

	public static MSBAL_DmndRecStsSrch.Srch02 crtSrch02() {
		MSBAL_DmndRecStsSrch lgc = new MSBAL_DmndRecStsSrch();
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

	/**
	 * Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL0040.Srch02_CndR createSrch02_CndR(){
		return mcframe.serverMSBA.MSBAL0040.Srch02_CndR.create();
	}

	/**
	 * Srch02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBA.MSBAL0040.Srch02_RsltR createSrch02_RsltR(){
		return mcframe.serverMSBA.MSBAL0040.Srch02_RsltR.create();
	}

	/**
	 * Srch02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBA.MSBAL0040.Srch02_RsltR> createSrch02_RsltL(){
		return MCList.create(mcframe.serverMSBA.MSBAL0040.Srch02_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 消込先と消込元の需要情報を検索する<br>
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
		private final mcframe.serverMSBA.MSBAL0040.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL0040.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL0040.Srch01_Rslt2R> down1;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBA.MSBAL0040.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBA.MSBAL0040.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMSBA.MSBAL0040.Srch01_Rslt2R.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBAL_DmndRecStsSrch)MSBAL_DmndRecStsSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL0040.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBA.MSBAL0040.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL0040.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMSBA.MSBAL0040.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL0040.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMSBA.MSBAL0040.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL0040.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMSBA.MSBAL0040.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL0040.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMSBA.MSBAL0040.Srch01_Rslt2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>dmnd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dmnd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>dmnd_period_typ</td></tr>
		 * 	<tr><td><br></td><td>dmnd_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_no</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>spln_vers</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
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
		 * </table>
		 *
		 * @see mcframe.serverMSBA.MSBAL0040.Srch01_CndR
		 */
		public mcframe.serverMSBA.MSBAL0040.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dmnd_no</td></tr>
		 * 	<tr><td><br></td><td>dmnd_dt</td></tr>
		 * 	<tr><td><br></td><td>dmnd_st_dt</td></tr>
		 * 	<tr><td><br></td><td>dmnd_end_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_st_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_end_dt</td></tr>
		 * 	<tr><td><br></td><td>dmnd_period_typ</td></tr>
		 * 	<tr><td><br></td><td>dmnd_period_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_typ</td></tr>
		 * 	<tr><td><br></td><td>dmnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>input_qty</td></tr>
		 * 	<tr><td><br></td><td>dmnd_qty</td></tr>
		 * 	<tr><td><br></td><td>rec_qty</td></tr>
		 * 	<tr><td><br></td><td>dmnd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_site_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_site_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>spln_vers</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
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
		public MCList<mcframe.serverMSBA.MSBAL0040.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>to_dmnd_no</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_no</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_dt</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_st_dt</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_end_dt</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_schd_st_dt</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_schd_end_dt</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_period_typ</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_period_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_typ</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>fr_input_qty</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_qty</td></tr>
		 * 	<tr><td><br></td><td>fr_rec_qty</td></tr>
		 * 	<tr><td><br></td><td>dmnd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_site_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_site_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_sno1</td></tr>
		 * 	<tr><td><br></td><td>fr_sno2</td></tr>
		 * 	<tr><td><br></td><td>fr_sno3</td></tr>
		 * 	<tr><td><br></td><td>fr_sno4</td></tr>
		 * 	<tr><td><br></td><td>fr_wrk_no</td></tr>
		 * 	<tr><td><br></td><td>fr_wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_cd</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_ym</td></tr>
		 * 	<tr><td><br></td><td>fr_spln_vers</td></tr>
		 * 	<tr><td><br></td><td>fr_spln_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>fr_spln_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>fr_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>fr_slo_no</td></tr>
		 * 	<tr><td><br></td><td>fr_slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>fr_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>fr_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>fr_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>fr_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
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
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>fr_ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>fr_ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>fr_ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_ins_ts</td></tr>
		 * 	<tr><td><br></td><td>fr_upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>fr_upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>fr_upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_upd_ts</td></tr>
		 * 	<tr><td><br></td><td>fr_upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL0040.Srch01_Rslt2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_DmndRecStsSrch)MSBAL_DmndRecStsSrch_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 消込状況を一覧表示するために検索する<br>
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
		private final mcframe.serverMSBA.MSBAL0040.Srch02_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBA.MSBAL0040.Srch02_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBA.MSBAL0040.Srch02_CndR.create();
			down0 = MCList.create(mcframe.serverMSBA.MSBAL0040.Srch02_RsltR.class);

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
			invoke((MSBAL_DmndRecStsSrch)MSBAL_DmndRecStsSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL0040.Srch02_CndR createSrch02_CndR(){
			return mcframe.serverMSBA.MSBAL0040.Srch02_CndR.create();
		}

		/**
		 * Srch02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBA.MSBAL0040.Srch02_RsltR createSrch02_RsltR(){
			return mcframe.serverMSBA.MSBAL0040.Srch02_RsltR.create();
		}

		/**
		 * Srch02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBA.MSBAL0040.Srch02_RsltR> createSrch02_RsltL(){
			return MCList.create(mcframe.serverMSBA.MSBAL0040.Srch02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>dmnd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dmnd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>dmnd_period_typ</td></tr>
		 * 	<tr><td><br></td><td>dmnd_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_no</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>spln_vers</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>spln_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>cst_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
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
		 * </table>
		 *
		 * @see mcframe.serverMSBA.MSBAL0040.Srch02_CndR
		 */
		public mcframe.serverMSBA.MSBAL0040.Srch02_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>to_dmnd_no</td></tr>
		 * 	<tr><td><br></td><td>to_dmnd_dt</td></tr>
		 * 	<tr><td><br></td><td>to_dmnd_st_dt</td></tr>
		 * 	<tr><td><br></td><td>to_dmnd_end_dt</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_schd_st_dt</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_schd_end_dt</td></tr>
		 * 	<tr><td><br></td><td>to_dmnd_period_typ</td></tr>
		 * 	<tr><td><br></td><td>to_dmnd_period_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>to_dmnd_typ</td></tr>
		 * 	<tr><td><br></td><td>to_dmnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_no</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_dt</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_st_dt</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_end_dt</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_schd_st_dt</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_schd_end_dt</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_period_typ</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_period_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_typ</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>to_input_qty</td></tr>
		 * 	<tr><td><br></td><td>to_dmnd_qty</td></tr>
		 * 	<tr><td><br></td><td>to_rec_qty</td></tr>
		 * 	<tr><td><br></td><td>fr_input_qty</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_qty</td></tr>
		 * 	<tr><td><br></td><td>fr_rec_qty</td></tr>
		 * 	<tr><td><br></td><td>dmnd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>dmnd_site_cd</td></tr>
		 * 	<tr><td><br></td><td>dmnd_site_nm</td></tr>
		 * 	<tr><td><br></td><td>to_sno1</td></tr>
		 * 	<tr><td><br></td><td>to_sno2</td></tr>
		 * 	<tr><td><br></td><td>to_sno3</td></tr>
		 * 	<tr><td><br></td><td>to_sno4</td></tr>
		 * 	<tr><td><br></td><td>to_wrk_no</td></tr>
		 * 	<tr><td><br></td><td>to_wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_sno1</td></tr>
		 * 	<tr><td><br></td><td>fr_sno2</td></tr>
		 * 	<tr><td><br></td><td>fr_sno3</td></tr>
		 * 	<tr><td><br></td><td>fr_sno4</td></tr>
		 * 	<tr><td><br></td><td>fr_wrk_no</td></tr>
		 * 	<tr><td><br></td><td>fr_wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>to_dmnd_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>to_dmnd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>to_dmnd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>to_dmnd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>fr_dmnd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>to_cst_cd</td></tr>
		 * 	<tr><td><br></td><td>to_cst_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_cd</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_nm</td></tr>
		 * 	<tr><td><br></td><td>to_ym</td></tr>
		 * 	<tr><td><br></td><td>to_spln_vers</td></tr>
		 * 	<tr><td><br></td><td>to_spln_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>to_spln_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>to_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>to_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>to_cst_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>to_cst_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>to_slo_no</td></tr>
		 * 	<tr><td><br></td><td>to_slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>fr_ym</td></tr>
		 * 	<tr><td><br></td><td>fr_spln_vers</td></tr>
		 * 	<tr><td><br></td><td>fr_spln_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>fr_spln_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>fr_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>fr_slo_no</td></tr>
		 * 	<tr><td><br></td><td>fr_slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>to_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>to_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>to_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>to_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>fr_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>fr_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>fr_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>fr_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
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
		 * 	<tr><td><br></td><td>to_dlv_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>to_dlv_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>fr_dlv_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>to_cst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>fr_cst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>to_ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>to_ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>to_ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>to_ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>to_ins_ts</td></tr>
		 * 	<tr><td><br></td><td>to_upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>to_upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>to_upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>to_upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>to_upd_ts</td></tr>
		 * 	<tr><td><br></td><td>to_upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>fr_ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>fr_ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>fr_ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_ins_ts</td></tr>
		 * 	<tr><td><br></td><td>fr_upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>fr_upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>fr_upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>fr_upd_ts</td></tr>
		 * 	<tr><td><br></td><td>fr_upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBA.MSBAL0040.Srch02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBAL_DmndRecStsSrch)MSBAL_DmndRecStsSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}