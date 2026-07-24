package mcframe.serverMSBC.MSBCL0290;

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
 * "MSBCL_ItmOrdGanttChart"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_ItmOrdGanttChart_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBCL0290";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_ItmOrdGanttChart.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBCL0290_Srch01_INFO;
		this.aSrch01 = ((MSBCL_ItmOrdGanttChart)this).new Srch01();
	}

	public static MSBCL_ItmOrdGanttChart.Srch01 crtSrch01() {
		MSBCL_ItmOrdGanttChart lgc = new MSBCL_ItmOrdGanttChart();
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
		p.addDownBlock(aSrch01.down3());
		p.addDownBlock(aSrch01.down4());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0290.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBC.MSBCL0290.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0290.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBC.MSBCL0290.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0290.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0290.Srch01_RsltR.class);
	}

	/**
	 * Srch01_LocブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0290.Srch01_LocR createSrch01_LocR(){
		return mcframe.serverMSBC.MSBCL0290.Srch01_LocR.create();
	}

	/**
	 * Srch01_LocブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0290.Srch01_LocR> createSrch01_LocL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0290.Srch01_LocR.class);
	}

	/**
	 * Srch01_RsrcLocブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0290.Srch01_RsrcLocR createSrch01_RsrcLocR(){
		return mcframe.serverMSBC.MSBCL0290.Srch01_RsrcLocR.create();
	}

	/**
	 * Srch01_RsrcLocブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0290.Srch01_RsrcLocR> createSrch01_RsrcLocL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0290.Srch01_RsrcLocR.class);
	}

	/**
	 * Srch01_CalブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0290.Srch01_CalR createSrch01_CalR(){
		return mcframe.serverMSBC.MSBCL0290.Srch01_CalR.create();
	}

	/**
	 * Srch01_CalブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0290.Srch01_CalR> createSrch01_CalL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0290.Srch01_CalR.class);
	}

	/**
	 * Srch01_AllocPlnブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0290.Srch01_AllocPlnR createSrch01_AllocPlnR(){
		return mcframe.serverMSBC.MSBCL0290.Srch01_AllocPlnR.create();
	}

	/**
	 * Srch01_AllocPlnブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0290.Srch01_AllocPlnR> createSrch01_AllocPlnL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0290.Srch01_AllocPlnR.class);
	}
	protected MSBCL_ItmOrdGanttChart.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBCL0290_Chk01_INFO;
		this.aChk01 = ((MSBCL_ItmOrdGanttChart)this).new Chk01();
	}

	public static MSBCL_ItmOrdGanttChart.Chk01 crtChk01() {
		MSBCL_ItmOrdGanttChart lgc = new MSBCL_ItmOrdGanttChart();
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
	 * Chk01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0290.Chk01_RsltR createChk01_RsltR(){
		return mcframe.serverMSBC.MSBCL0290.Chk01_RsltR.create();
	}

	/**
	 * Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0290.Chk01_RsltR> createChk01_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0290.Chk01_RsltR.class);
	}
	protected MSBCL_ItmOrdGanttChart.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBCL0290_Upd01_INFO;
		this.aUpd01 = ((MSBCL_ItmOrdGanttChart)this).new Upd01();
	}

	public static MSBCL_ItmOrdGanttChart.Upd01 crtUpd01() {
		MSBCL_ItmOrdGanttChart lgc = new MSBCL_ItmOrdGanttChart();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0290.Chk01_RsltR createUpd01_RsltR(){
		return mcframe.serverMSBC.MSBCL0290.Chk01_RsltR.create();
	}

	/**
	 * Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0290.Chk01_RsltR> createUpd01_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0290.Chk01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
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
		private final mcframe.serverMSBC.MSBCL0290.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0290.Srch01_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0290.Srch01_LocR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0290.Srch01_RsrcLocR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0290.Srch01_CalR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0290.Srch01_AllocPlnR> down4;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL0290.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL0290.Srch01_RsltR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL0290.Srch01_LocR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL0290.Srch01_RsrcLocR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL0290.Srch01_CalR.class);
			down4 = MCList.create(mcframe.serverMSBC.MSBCL0290.Srch01_AllocPlnR.class);

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
			if (i == 3) return down3();
			if (i == 4) return down4();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_ItmOrdGanttChart)MSBCL_ItmOrdGanttChart_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0290.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBC.MSBCL0290.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0290.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBC.MSBCL0290.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0290.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0290.Srch01_RsltR.class);
		}

		/**
		 * Srch01_LocブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0290.Srch01_LocR createSrch01_LocR(){
			return mcframe.serverMSBC.MSBCL0290.Srch01_LocR.create();
		}

		/**
		 * Srch01_LocブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0290.Srch01_LocR> createSrch01_LocL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0290.Srch01_LocR.class);
		}

		/**
		 * Srch01_RsrcLocブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0290.Srch01_RsrcLocR createSrch01_RsrcLocR(){
			return mcframe.serverMSBC.MSBCL0290.Srch01_RsrcLocR.create();
		}

		/**
		 * Srch01_RsrcLocブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0290.Srch01_RsrcLocR> createSrch01_RsrcLocL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0290.Srch01_RsrcLocR.class);
		}

		/**
		 * Srch01_CalブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0290.Srch01_CalR createSrch01_CalR(){
			return mcframe.serverMSBC.MSBCL0290.Srch01_CalR.create();
		}

		/**
		 * Srch01_CalブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0290.Srch01_CalR> createSrch01_CalL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0290.Srch01_CalR.class);
		}

		/**
		 * Srch01_AllocPlnブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0290.Srch01_AllocPlnR createSrch01_AllocPlnR(){
			return mcframe.serverMSBC.MSBCL0290.Srch01_AllocPlnR.create();
		}

		/**
		 * Srch01_AllocPlnブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0290.Srch01_AllocPlnR> createSrch01_AllocPlnL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0290.Srch01_AllocPlnR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>opn_flg</td></tr>
		 * 	<tr><td><br></td><td>sav_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_flg</td></tr>
		 * 	<tr><td><br></td><td>cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>prcd_flg</td></tr>
		 * 	<tr><td><br></td><td>sim_flg</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_pln_mrp_typ</td></tr>
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
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0290.Srch01_CndR
		 */
		public mcframe.serverMSBC.MSBCL0290.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_ld_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_ld_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_nm1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_act_qty1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_nm1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_dec_place1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_rnd_typ1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd2</td></tr>
		 * 	<tr><td><br></td><td>rsrc_nm2</td></tr>
		 * 	<tr><td><br></td><td>rsrc_act_qty2</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_nm2</td></tr>
		 * 	<tr><td><br></td><td>rsrc_dec_place2</td></tr>
		 * 	<tr><td><br></td><td>rsrc_rnd_typ2</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
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
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
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
		public MCList<mcframe.serverMSBC.MSBCL0290.Srch01_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>cal_cd</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_nm1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_nm1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_dec_place1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_rnd_typ1</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd2</td></tr>
		 * 	<tr><td><br></td><td>rsrc_nm2</td></tr>
		 * 	<tr><td><br></td><td>rsrc_unit_nm2</td></tr>
		 * 	<tr><td><br></td><td>rsrc_dec_place2</td></tr>
		 * 	<tr><td><br></td><td>rsrc_rnd_typ2</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0290.Srch01_LocR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rsrc_cd</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>base_qty</td></tr>
		 * 	<tr><td><br></td><td>act_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0290.Srch01_RsrcLocR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cal_cd</td></tr>
		 * 	<tr><td><br></td><td>off_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0290.Srch01_CalR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0290.Srch01_AllocPlnR> down4() {
			return down4;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_ItmOrdGanttChart)MSBCL_ItmOrdGanttChart_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
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
		private final MCList<mcframe.serverMSBC.MSBCL0290.Chk01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0290.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL0290.Chk01_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL0290.Chk01_RsltR.class);

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
			invoke((MSBCL_ItmOrdGanttChart)MSBCL_ItmOrdGanttChart_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0290.Chk01_RsltR createChk01_RsltR(){
			return mcframe.serverMSBC.MSBCL0290.Chk01_RsltR.create();
		}

		/**
		 * Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0290.Chk01_RsltR> createChk01_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0290.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>old_itm_ord_ld_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_ld_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ord.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0290.Chk01_RsltR> up0() {
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
		 * 	<tr><td><br></td><td>old_itm_ord_ld_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_ld_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_gnrt_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.nmr_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.dnm_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.fxd_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.fix_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.purc_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.xfr_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_offst</td></tr>
		 * 	<tr><td><br></td><td>ord.avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.master_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.sno1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno4</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>ord.lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_fix_pd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>ord.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ord.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0290.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_ItmOrdGanttChart)MSBCL_ItmOrdGanttChart_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
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
		private final MCList<mcframe.serverMSBC.MSBCL0290.Chk01_RsltR> up0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL0290.Chk01_RsltR.class);

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
			invoke((MSBCL_ItmOrdGanttChart)MSBCL_ItmOrdGanttChart_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0290.Chk01_RsltR createUpd01_RsltR(){
			return mcframe.serverMSBC.MSBCL0290.Chk01_RsltR.create();
		}

		/**
		 * Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0290.Chk01_RsltR> createUpd01_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0290.Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>old_itm_ord_ld_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_ld_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ord.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0290.Chk01_RsltR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_ItmOrdGanttChart)MSBCL_ItmOrdGanttChart_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}