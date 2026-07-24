package mcframe.serverMSBE.MSBEB0030;

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
 * "MSBEB_OPStkRplRegBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEB_OPStkRplRegBatch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEB0030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEB_OPStkRplRegBatch.OPStkRplReg_Ins01 aOPStkRplReg_Ins01;

	protected void initOPStkRplReg_Ins01() {
		this.info = PDef.MS_MSBEB0030_OPStkRplReg_Ins01_INFO;
		this.aOPStkRplReg_Ins01 = ((MSBEB_OPStkRplRegBatch)this).new OPStkRplReg_Ins01();
	}

	public static MSBEB_OPStkRplRegBatch.OPStkRplReg_Ins01 crtOPStkRplReg_Ins01() {
		MSBEB_OPStkRplRegBatch lgc = new MSBEB_OPStkRplRegBatch();
		lgc.initOPStkRplReg_Ins01();
		return lgc.aOPStkRplReg_Ins01;
	}

	protected void paramOPStkRplReg_Ins01(MCParam p) {
		if (this.aOPStkRplReg_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOPStkRplReg_Ins01.up0());
	}

	protected void doOPStkRplReg_Ins01() {
		aOPStkRplReg_Ins01.call();
	};

	/**
	 * OPStkRplReg_Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins01_CndR createOPStkRplReg_Ins01_CndR(){
		return mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins01_CndR.create();
	}
	protected MSBEB_OPStkRplRegBatch.OPStkRplReg_Ins02 aOPStkRplReg_Ins02;

	protected void initOPStkRplReg_Ins02() {
		this.info = PDef.MS_MSBEB0030_OPStkRplReg_Ins02_INFO;
		this.aOPStkRplReg_Ins02 = ((MSBEB_OPStkRplRegBatch)this).new OPStkRplReg_Ins02();
	}

	public static MSBEB_OPStkRplRegBatch.OPStkRplReg_Ins02 crtOPStkRplReg_Ins02() {
		MSBEB_OPStkRplRegBatch lgc = new MSBEB_OPStkRplRegBatch();
		lgc.initOPStkRplReg_Ins02();
		return lgc.aOPStkRplReg_Ins02;
	}

	protected void paramOPStkRplReg_Ins02(MCParam p) {
		if (this.aOPStkRplReg_Ins02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOPStkRplReg_Ins02.up0());
		p.addDownBlock(aOPStkRplReg_Ins02.down0());
	}

	protected void doOPStkRplReg_Ins02() {
		aOPStkRplReg_Ins02.call();
	};

	/**
	 * OPStkRplReg_Ins02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_DtlR createOPStkRplReg_Ins02_DtlR(){
		return mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_DtlR.create();
	}

	/**
	 * OPStkRplReg_Ins02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_DtlR> createOPStkRplReg_Ins02_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_DtlR.class);
	}

	/**
	 * OPStkRplReg_Ins02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_RsltR createOPStkRplReg_Ins02_RsltR(){
		return mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_RsltR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * OPStkRplReg_Ins01オペレーション.<p>
	 *
	 */
	abstract public class OPStkRplReg_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OPStkRplReg_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins01_CndR up0;
		
		
		// コンストラクタ
		protected OPStkRplReg_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins01_CndR.create();

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
			invoke((MSBEB_OPStkRplRegBatch)MSBEB_OPStkRplRegBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * OPStkRplReg_Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins01_CndR createOPStkRplReg_Ins01_CndR(){
			return mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins01_CndR
		 */
		public mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEB_OPStkRplRegBatch)MSBEB_OPStkRplRegBatch_MC_A.this).info;
		}


	}
	/**
	 * OPStkRplReg_Ins02オペレーション.<p>
	 *
	 */
	abstract public class OPStkRplReg_Ins02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OPStkRplReg_Ins02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_RsltR down0;
		
		
		// コンストラクタ
		protected OPStkRplReg_Ins02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_RsltR.create();

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
			invoke((MSBEB_OPStkRplRegBatch)MSBEB_OPStkRplRegBatch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OPStkRplReg_Ins02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_DtlR createOPStkRplReg_Ins02_DtlR(){
			return mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_DtlR.create();
		}

		/**
		 * OPStkRplReg_Ins02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_DtlR> createOPStkRplReg_Ins02_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_DtlR.class);
		}

		/**
		 * OPStkRplReg_Ins02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_RsltR createOPStkRplReg_Ins02_RsltR(){
			return mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>op_rpl_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_qty</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt_to</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_cnt</td></tr>
		 * 	<tr><td><br></td><td>success_cnt</td></tr>
		 * 	<tr><td><br></td><td>error_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_RsltR
		 */
		public mcframe.serverMSBE.MSBEB0030.OPStkRplReg_Ins02_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEB_OPStkRplRegBatch)MSBEB_OPStkRplRegBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}