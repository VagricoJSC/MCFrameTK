package mcframe.serverMSBB.MSBBL1400;

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
 * "MSBBL_SlsSumSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBL_SlsSumSrch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBBL1400";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBL_SlsSumSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBBL1400_Srch01_INFO;
		this.aSrch01 = ((MSBBL_SlsSumSrch)this).new Srch01();
	}

	public static MSBBL_SlsSumSrch.Srch01 crtSrch01() {
		MSBBL_SlsSumSrch lgc = new MSBBL_SlsSumSrch();
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
	public mcframe.serverMSBB.MSBBL1400.CndR createCndR(){
		return mcframe.serverMSBB.MSBBL1400.CndR.create();
	}

	/**
	 * RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1400.RsltR createRsltR(){
		return mcframe.serverMSBB.MSBBL1400.RsltR.create();
	}

	/**
	 * RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1400.RsltR> createRsltL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1400.RsltR.class);
	}
	protected MSBBL_SlsSumSrch.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBBL1400_Srch02_INFO;
		this.aSrch02 = ((MSBBL_SlsSumSrch)this).new Srch02();
	}

	public static MSBBL_SlsSumSrch.Srch02 crtSrch02() {
		MSBBL_SlsSumSrch lgc = new MSBBL_SlsSumSrch();
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

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 部門別に集計して検索する<br>
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
		private final mcframe.serverMSBB.MSBBL1400.CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1400.RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1400.CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1400.RsltR.class);

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
			invoke((MSBBL_SlsSumSrch)MSBBL_SlsSumSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1400.CndR createCndR(){
			return mcframe.serverMSBB.MSBBL1400.CndR.create();
		}

		/**
		 * RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1400.RsltR createRsltR(){
			return mcframe.serverMSBB.MSBBL1400.RsltR.create();
		}

		/**
		 * RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1400.RsltR> createRsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1400.RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_trnst_disp</td></tr>
		 * 	<tr><td><br></td><td>sls_disp_term</td></tr>
		 * 	<tr><td><br></td><td>sum_term</td></tr>
		 * 	<tr><td><br></td><td>sls_bdg_grp</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>use_act_xrate_flg</td></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1400.CndR
		 */
		public mcframe.serverMSBB.MSBBL1400.CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_typ</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_lvl_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt1</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm1</td></tr>
		 * 	<tr><td><br></td><td>dpt2</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm2</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_amt</td></tr>
		 * 	<tr><td><br></td><td>slo_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>slo_prof_rate</td></tr>
		 * 	<tr><td><br></td><td>spln_per_cmpl_slo_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_per_cmpl_slo_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_per_cmpl_slo_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>slo_bl_amt</td></tr>
		 * 	<tr><td><br></td><td>slo_bl_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>slo_bl_prof_rate</td></tr>
		 * 	<tr><td><br></td><td>spln_per_cmpl_slo_bl_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_per_cmpl_slo_bl_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_per_cmpl_slo_bl_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>sls_amt</td></tr>
		 * 	<tr><td><br></td><td>sls_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>sls_prof_rate</td></tr>
		 * 	<tr><td><br></td><td>sum_amt</td></tr>
		 * 	<tr><td><br></td><td>sum_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>sum_prof_rate</td></tr>
		 * 	<tr><td><br></td><td>spln_per_cmpl_sum_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_per_cmpl_sum_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_per_cmpl_sum_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>spln_amt</td></tr>
		 * 	<tr><td><br></td><td>spln_per_cmpl_sls_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_sls_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_sls_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_sls_prof_rate</td></tr>
		 * 	<tr><td><br></td><td>bdg_per_cmpl_sls_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_per_cmpl_sls_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>rate_dec_place</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1400.RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsSumSrch)MSBBL_SlsSumSrch_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 品目体系別に集計して検索する<br>
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
		private final mcframe.serverMSBB.MSBBL1400.CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1400.RsltR> down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1400.CndR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1400.RsltR.class);

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
			invoke((MSBBL_SlsSumSrch)MSBBL_SlsSumSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1400.CndR createCndR(){
			return mcframe.serverMSBB.MSBBL1400.CndR.create();
		}

		/**
		 * RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1400.RsltR createRsltR(){
			return mcframe.serverMSBB.MSBBL1400.RsltR.create();
		}

		/**
		 * RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1400.RsltR> createRsltL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1400.RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_trnst_disp</td></tr>
		 * 	<tr><td><br></td><td>sls_disp_term</td></tr>
		 * 	<tr><td><br></td><td>sum_term</td></tr>
		 * 	<tr><td><br></td><td>sls_bdg_grp</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>use_act_xrate_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_grp_lvl</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_grp_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1400.CndR
		 */
		public mcframe.serverMSBB.MSBBL1400.CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_typ</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>itm_grp1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_qty</td></tr>
		 * 	<tr><td><br></td><td>slo_amt</td></tr>
		 * 	<tr><td><br></td><td>slo_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>slo_prof_rate</td></tr>
		 * 	<tr><td><br></td><td>spln_per_cmpl_slo_qty</td></tr>
		 * 	<tr><td><br></td><td>spln_per_cmpl_slo_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_per_cmpl_slo_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_per_cmpl_slo_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>slo_bl_qty</td></tr>
		 * 	<tr><td><br></td><td>slo_bl_amt</td></tr>
		 * 	<tr><td><br></td><td>slo_bl_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>slo_bl_prof_rate</td></tr>
		 * 	<tr><td><br></td><td>spln_per_cmpl_slo_bl_qty</td></tr>
		 * 	<tr><td><br></td><td>spln_per_cmpl_slo_bl_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_per_cmpl_slo_bl_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_per_cmpl_slo_bl_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>sls_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_amt</td></tr>
		 * 	<tr><td><br></td><td>sls_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>sls_prof_rate</td></tr>
		 * 	<tr><td><br></td><td>sum_qty</td></tr>
		 * 	<tr><td><br></td><td>sum_amt</td></tr>
		 * 	<tr><td><br></td><td>sum_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>sum_prof_rate</td></tr>
		 * 	<tr><td><br></td><td>spln_per_cmpl_sum_qty</td></tr>
		 * 	<tr><td><br></td><td>spln_per_cmpl_sum_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_per_cmpl_sum_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_per_cmpl_sum_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>spln_qty</td></tr>
		 * 	<tr><td><br></td><td>spln_amt</td></tr>
		 * 	<tr><td><br></td><td>spln_per_cmpl_sls_qty</td></tr>
		 * 	<tr><td><br></td><td>spln_per_cmpl_sls_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_sls_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_sls_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_sls_prof_rate</td></tr>
		 * 	<tr><td><br></td><td>bdg_per_cmpl_sls_amt</td></tr>
		 * 	<tr><td><br></td><td>bdg_per_cmpl_sls_prof_amt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>rate_dec_place</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1400.RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsSumSrch)MSBBL_SlsSumSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}