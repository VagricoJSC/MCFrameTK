package mcframe.serverMSBE.MSBEL5070;

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
 * "MSBEL_OPStkRplService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_OPStkRplService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL5070";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_OPStkRplService.OPRqst_Srch01 aOPRqst_Srch01;

	protected void initOPRqst_Srch01() {
		this.info = PDef.MS_MSBEL5070_OPRqst_Srch01_INFO;
		this.aOPRqst_Srch01 = ((MSBEL_OPStkRplService)this).new OPRqst_Srch01();
	}

	public static MSBEL_OPStkRplService.OPRqst_Srch01 crtOPRqst_Srch01() {
		MSBEL_OPStkRplService lgc = new MSBEL_OPStkRplService();
		lgc.initOPRqst_Srch01();
		return lgc.aOPRqst_Srch01;
	}

	protected void paramOPRqst_Srch01(MCParam p) {
		if (this.aOPRqst_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOPRqst_Srch01.up0());
		p.addDownBlock(aOPRqst_Srch01.down0());
	}

	protected void doOPRqst_Srch01() {
		aOPRqst_Srch01.call();
	};

	/**
	 * OPRqst_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_CndR createOPRqst_Srch01_CndR(){
		return mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_CndR.create();
	}

	/**
	 * OPRqst_Srch01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_CndR> createOPRqst_Srch01_CndL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_CndR.class);
	}

	/**
	 * OPRqst_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_RsltR createOPRqst_Srch01_RsltR(){
		return mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_RsltR.create();
	}

	/**
	 * OPRqst_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_RsltR> createOPRqst_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_RsltR.class);
	}
	protected MSBEL_OPStkRplService.OPRqst_Srch02 aOPRqst_Srch02;

	protected void initOPRqst_Srch02() {
		this.info = PDef.MS_MSBEL5070_OPRqst_Srch02_INFO;
		this.aOPRqst_Srch02 = ((MSBEL_OPStkRplService)this).new OPRqst_Srch02();
	}

	public static MSBEL_OPStkRplService.OPRqst_Srch02 crtOPRqst_Srch02() {
		MSBEL_OPStkRplService lgc = new MSBEL_OPStkRplService();
		lgc.initOPRqst_Srch02();
		return lgc.aOPRqst_Srch02;
	}

	protected void paramOPRqst_Srch02(MCParam p) {
		if (this.aOPRqst_Srch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOPRqst_Srch02.up0());
		p.addDownBlock(aOPRqst_Srch02.down0());
	}

	protected void doOPRqst_Srch02() {
		aOPRqst_Srch02.call();
	};

	/**
	 * OPRqst_Srch02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5070.OPRqst_Srch02_RsltR createOPRqst_Srch02_RsltR(){
		return mcframe.serverMSBE.MSBEL5070.OPRqst_Srch02_RsltR.create();
	}

	/**
	 * OPRqst_Srch02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Srch02_RsltR> createOPRqst_Srch02_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Srch02_RsltR.class);
	}
	protected MSBEL_OPStkRplService.OPRqst_Chk01 aOPRqst_Chk01;

	protected void initOPRqst_Chk01() {
		this.info = PDef.MS_MSBEL5070_OPRqst_Chk01_INFO;
		this.aOPRqst_Chk01 = ((MSBEL_OPStkRplService)this).new OPRqst_Chk01();
	}

	public static MSBEL_OPStkRplService.OPRqst_Chk01 crtOPRqst_Chk01() {
		MSBEL_OPStkRplService lgc = new MSBEL_OPStkRplService();
		lgc.initOPRqst_Chk01();
		return lgc.aOPRqst_Chk01;
	}

	protected void paramOPRqst_Chk01(MCParam p) {
		if (this.aOPRqst_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOPRqst_Chk01.up0());
		p.addDownBlock(aOPRqst_Chk01.down0());
	}

	protected void doOPRqst_Chk01() {
		aOPRqst_Chk01.call();
	};

	/**
	 * OPRqst_Chk01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR createOPRqst_Chk01_RsltR(){
		return mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR.create();
	}

	/**
	 * OPRqst_Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR> createOPRqst_Chk01_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR.class);
	}
	protected MSBEL_OPStkRplService.OPRqst_Ins01 aOPRqst_Ins01;

	protected void initOPRqst_Ins01() {
		this.info = PDef.MS_MSBEL5070_OPRqst_Ins01_INFO;
		this.aOPRqst_Ins01 = ((MSBEL_OPStkRplService)this).new OPRqst_Ins01();
	}

	public static MSBEL_OPStkRplService.OPRqst_Ins01 crtOPRqst_Ins01() {
		MSBEL_OPStkRplService lgc = new MSBEL_OPStkRplService();
		lgc.initOPRqst_Ins01();
		return lgc.aOPRqst_Ins01;
	}

	protected void paramOPRqst_Ins01(MCParam p) {
		if (this.aOPRqst_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOPRqst_Ins01.up0());
		p.addDownBlock(aOPRqst_Ins01.down0());
	}

	protected void doOPRqst_Ins01() {
		aOPRqst_Ins01.call();
	};

	/**
	 * OPRqst_Ins01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR createOPRqst_Ins01_RsltR(){
		return mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR.create();
	}

	/**
	 * OPRqst_Ins01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR> createOPRqst_Ins01_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * OPRqst_Srch01オペレーション.<p>
	 *
	 */
	abstract public class OPRqst_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OPRqst_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected OPRqst_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_CndR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_RsltR.class);

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
			invoke((MSBEL_OPStkRplService)MSBEL_OPStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OPRqst_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_CndR createOPRqst_Srch01_CndR(){
			return mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_CndR.create();
		}

		/**
		 * OPRqst_Srch01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_CndR> createOPRqst_Srch01_CndL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_CndR.class);
		}

		/**
		 * OPRqst_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_RsltR createOPRqst_Srch01_RsltR(){
			return mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_RsltR.create();
		}

		/**
		 * OPRqst_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_RsltR> createOPRqst_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rord_stk_qty</td></tr>
		 * 	<tr><td><br></td><td>rord_rqst_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_qty</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>shortage_qty</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>shortage_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>shortage_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_OPStkRplService)MSBEL_OPStkRplService_MC_A.this).info;
		}


	}
	/**
	 * OPRqst_Srch02オペレーション.<p>
	 *
	 */
	abstract public class OPRqst_Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OPRqst_Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Srch02_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Srch02_RsltR> down0;
		
		
		// コンストラクタ
		protected OPRqst_Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Srch02_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Srch02_RsltR.class);

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
			invoke((MSBEL_OPStkRplService)MSBEL_OPStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OPRqst_Srch02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5070.OPRqst_Srch02_RsltR createOPRqst_Srch02_RsltR(){
			return mcframe.serverMSBE.MSBEL5070.OPRqst_Srch02_RsltR.create();
		}

		/**
		 * OPRqst_Srch02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Srch02_RsltR> createOPRqst_Srch02_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Srch02_RsltR.class);
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
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_qty</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Srch02_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_qty</td></tr>
		 * 	<tr><td><br></td><td>op_rpl_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Srch02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_OPStkRplService)MSBEL_OPStkRplService_MC_A.this).info;
		}


	}
	/**
	 * OPRqst_Chk01オペレーション.<p>
	 *
	 */
	abstract public class OPRqst_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OPRqst_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected OPRqst_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR.class);

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
			invoke((MSBEL_OPStkRplService)MSBEL_OPStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OPRqst_Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR createOPRqst_Chk01_RsltR(){
			return mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR.create();
		}

		/**
		 * OPRqst_Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR> createOPRqst_Chk01_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_qty</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>inst_po_cnt_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_site_cd</td></tr>
		 * 	<tr><td><br></td><td>op_rpl_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_qty</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_OPStkRplService)MSBEL_OPStkRplService_MC_A.this).info;
		}


	}
	/**
	 * OPRqst_Ins01オペレーション.<p>
	 *
	 */
	abstract public class OPRqst_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OPRqst_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected OPRqst_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR.class);

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
			invoke((MSBEL_OPStkRplService)MSBEL_OPStkRplService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OPRqst_Ins01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR createOPRqst_Ins01_RsltR(){
			return mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR.create();
		}

		/**
		 * OPRqst_Ins01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR> createOPRqst_Ins01_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_site_cd</td></tr>
		 * 	<tr><td><br></td><td>op_rpl_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_qty</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>screen_crct_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_po_cnt_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR> up0() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5070.OPRqst_Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_OPStkRplService)MSBEL_OPStkRplService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}