package mcframe.serverMSBB.MSBBL6220;

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
 * "MSBBL_SlsSchdService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBL_SlsSchdService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBBL6220";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBL_SlsSchdService.Sls_Schd_Upd01 aSls_Schd_Upd01;

	protected void initSls_Schd_Upd01() {
		this.info = PDef.MS_MSBBL6220_Sls_Schd_Upd01_INFO;
		this.aSls_Schd_Upd01 = ((MSBBL_SlsSchdService)this).new Sls_Schd_Upd01();
	}

	public static MSBBL_SlsSchdService.Sls_Schd_Upd01 crtSls_Schd_Upd01() {
		MSBBL_SlsSchdService lgc = new MSBBL_SlsSchdService();
		lgc.initSls_Schd_Upd01();
		return lgc.aSls_Schd_Upd01;
	}

	protected void paramSls_Schd_Upd01(MCParam p) {
		if (this.aSls_Schd_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSls_Schd_Upd01.up0());
	}

	protected void doSls_Schd_Upd01() {
		aSls_Schd_Upd01.call();
	};

	/**
	 * Sls_Schd_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd01_DtlR createSls_Schd_Upd01_DtlR(){
		return mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd01_DtlR.create();
	}

	/**
	 * Sls_Schd_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd01_DtlR> createSls_Schd_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd01_DtlR.class);
	}
	protected MSBBL_SlsSchdService.Sls_Schd_Upd02 aSls_Schd_Upd02;

	protected void initSls_Schd_Upd02() {
		this.info = PDef.MS_MSBBL6220_Sls_Schd_Upd02_INFO;
		this.aSls_Schd_Upd02 = ((MSBBL_SlsSchdService)this).new Sls_Schd_Upd02();
	}

	public static MSBBL_SlsSchdService.Sls_Schd_Upd02 crtSls_Schd_Upd02() {
		MSBBL_SlsSchdService lgc = new MSBBL_SlsSchdService();
		lgc.initSls_Schd_Upd02();
		return lgc.aSls_Schd_Upd02;
	}

	protected void paramSls_Schd_Upd02(MCParam p) {
		if (this.aSls_Schd_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSls_Schd_Upd02.up0());
		p.addUpBlock(aSls_Schd_Upd02.up1());
	}

	protected void doSls_Schd_Upd02() {
		aSls_Schd_Upd02.call();
	};

	/**
	 * Sls_Schd_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_DtlR createSls_Schd_Upd02_DtlR(){
		return mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_DtlR.create();
	}

	/**
	 * Sls_Schd_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_DtlR> createSls_Schd_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_DtlR.class);
	}

	/**
	 * Sls_Schd_Upd02_ShipActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_ShipActR createSls_Schd_Upd02_ShipActR(){
		return mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_ShipActR.create();
	}

	/**
	 * Sls_Schd_Upd02_ShipActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_ShipActR> createSls_Schd_Upd02_ShipActL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_ShipActR.class);
	}
	protected MSBBL_SlsSchdService.Sls_Schd_Upd03 aSls_Schd_Upd03;

	protected void initSls_Schd_Upd03() {
		this.info = PDef.MS_MSBBL6220_Sls_Schd_Upd03_INFO;
		this.aSls_Schd_Upd03 = ((MSBBL_SlsSchdService)this).new Sls_Schd_Upd03();
	}

	public static MSBBL_SlsSchdService.Sls_Schd_Upd03 crtSls_Schd_Upd03() {
		MSBBL_SlsSchdService lgc = new MSBBL_SlsSchdService();
		lgc.initSls_Schd_Upd03();
		return lgc.aSls_Schd_Upd03;
	}

	protected void paramSls_Schd_Upd03(MCParam p) {
		if (this.aSls_Schd_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSls_Schd_Upd03.up0());
	}

	protected void doSls_Schd_Upd03() {
		aSls_Schd_Upd03.call();
	};

	/**
	 * Sls_Schd_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd03_DtlR createSls_Schd_Upd03_DtlR(){
		return mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd03_DtlR.create();
	}

	/**
	 * Sls_Schd_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd03_DtlR> createSls_Schd_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd03_DtlR.class);
	}
	protected MSBBL_SlsSchdService.Sls_Schd_Upd04 aSls_Schd_Upd04;

	protected void initSls_Schd_Upd04() {
		this.info = PDef.MS_MSBBL6220_Sls_Schd_Upd04_INFO;
		this.aSls_Schd_Upd04 = ((MSBBL_SlsSchdService)this).new Sls_Schd_Upd04();
	}

	public static MSBBL_SlsSchdService.Sls_Schd_Upd04 crtSls_Schd_Upd04() {
		MSBBL_SlsSchdService lgc = new MSBBL_SlsSchdService();
		lgc.initSls_Schd_Upd04();
		return lgc.aSls_Schd_Upd04;
	}

	protected void paramSls_Schd_Upd04(MCParam p) {
		if (this.aSls_Schd_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSls_Schd_Upd04.up0());
	}

	protected void doSls_Schd_Upd04() {
		aSls_Schd_Upd04.call();
	};

	/**
	 * Sls_Schd_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd04_DtlR createSls_Schd_Upd04_DtlR(){
		return mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd04_DtlR.create();
	}

	/**
	 * Sls_Schd_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd04_DtlR> createSls_Schd_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd04_DtlR.class);
	}
	protected MSBBL_SlsSchdService.Sls_Schd_Upd05 aSls_Schd_Upd05;

	protected void initSls_Schd_Upd05() {
		this.info = PDef.MS_MSBBL6220_Sls_Schd_Upd05_INFO;
		this.aSls_Schd_Upd05 = ((MSBBL_SlsSchdService)this).new Sls_Schd_Upd05();
	}

	public static MSBBL_SlsSchdService.Sls_Schd_Upd05 crtSls_Schd_Upd05() {
		MSBBL_SlsSchdService lgc = new MSBBL_SlsSchdService();
		lgc.initSls_Schd_Upd05();
		return lgc.aSls_Schd_Upd05;
	}

	protected void paramSls_Schd_Upd05(MCParam p) {
		if (this.aSls_Schd_Upd05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSls_Schd_Upd05.up0());
		p.addUpBlock(aSls_Schd_Upd05.up1());
	}

	protected void doSls_Schd_Upd05() {
		aSls_Schd_Upd05.call();
	};

	/**
	 * Sls_Schd_Upd05_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_DtlR createSls_Schd_Upd05_DtlR(){
		return mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_DtlR.create();
	}

	/**
	 * Sls_Schd_Upd05_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_DtlR> createSls_Schd_Upd05_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_DtlR.class);
	}

	/**
	 * Sls_Schd_Upd05_IVActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_IVActR createSls_Schd_Upd05_IVActR(){
		return mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_IVActR.create();
	}

	/**
	 * Sls_Schd_Upd05_IVActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_IVActR> createSls_Schd_Upd05_IVActL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_IVActR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Sls_Schd_Upd01オペレーション.<p>
	 *
	 */
	abstract public class Sls_Schd_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sls_Schd_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected Sls_Schd_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd01_DtlR.class);

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
			invoke((MSBBL_SlsSchdService)MSBBL_SlsSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Sls_Schd_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd01_DtlR createSls_Schd_Upd01_DtlR(){
			return mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd01_DtlR.create();
		}

		/**
		 * Sls_Schd_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd01_DtlR> createSls_Schd_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_no_up_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsSchdService)MSBBL_SlsSchdService_MC_A.this).info;
		}


	}
	/**
	 * Sls_Schd_Upd02オペレーション.<p>
	 *
	 */
	abstract public class Sls_Schd_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sls_Schd_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_ShipActR> up1;
		
		
		// コンストラクタ
		protected Sls_Schd_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_DtlR.class);
			up1 = MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_ShipActR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_SlsSchdService)MSBBL_SlsSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Sls_Schd_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_DtlR createSls_Schd_Upd02_DtlR(){
			return mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_DtlR.create();
		}

		/**
		 * Sls_Schd_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_DtlR> createSls_Schd_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_DtlR.class);
		}

		/**
		 * Sls_Schd_Upd02_ShipActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_ShipActR createSls_Schd_Upd02_ShipActR(){
			return mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_ShipActR.create();
		}

		/**
		 * Sls_Schd_Upd02_ShipActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_ShipActR> createSls_Schd_Upd02_ShipActL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_ShipActR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_no_up_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd02_ShipActR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsSchdService)MSBBL_SlsSchdService_MC_A.this).info;
		}


	}
	/**
	 * Sls_Schd_Upd03オペレーション.<p>
	 *
	 */
	abstract public class Sls_Schd_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sls_Schd_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd03_DtlR> up0;
		
		
		// コンストラクタ
		protected Sls_Schd_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd03_DtlR.class);

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
			invoke((MSBBL_SlsSchdService)MSBBL_SlsSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Sls_Schd_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd03_DtlR createSls_Schd_Upd03_DtlR(){
			return mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd03_DtlR.create();
		}

		/**
		 * Sls_Schd_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd03_DtlR> createSls_Schd_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd03_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_sls_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>manual_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd03_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsSchdService)MSBBL_SlsSchdService_MC_A.this).info;
		}


	}
	/**
	 * Sls_Schd_Upd04オペレーション.<p>
	 *
	 */
	abstract public class Sls_Schd_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sls_Schd_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd04_DtlR> up0;
		
		
		// コンストラクタ
		protected Sls_Schd_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd04_DtlR.class);

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
			invoke((MSBBL_SlsSchdService)MSBBL_SlsSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Sls_Schd_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd04_DtlR createSls_Schd_Upd04_DtlR(){
			return mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd04_DtlR.create();
		}

		/**
		 * Sls_Schd_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd04_DtlR> createSls_Schd_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd04_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_no_up_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_po_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_purc_sync_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_lg_grp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd04_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsSchdService)MSBBL_SlsSchdService_MC_A.this).info;
		}


	}
	/**
	 * Sls_Schd_Upd05オペレーション.<p>
	 *
	 */
	abstract public class Sls_Schd_Upd05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sls_Schd_Upd05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_IVActR> up1;
		
		
		// コンストラクタ
		protected Sls_Schd_Upd05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_DtlR.class);
			up1 = MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_IVActR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_SlsSchdService)MSBBL_SlsSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Sls_Schd_Upd05_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_DtlR createSls_Schd_Upd05_DtlR(){
			return mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_DtlR.create();
		}

		/**
		 * Sls_Schd_Upd05_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_DtlR> createSls_Schd_Upd05_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_DtlR.class);
		}

		/**
		 * Sls_Schd_Upd05_IVActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_IVActR createSls_Schd_Upd05_IVActR(){
			return mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_IVActR.create();
		}

		/**
		 * Sls_Schd_Upd05_IVActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_IVActR> createSls_Schd_Upd05_IVActL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_IVActR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_schd_src_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_flg</td></tr>
		 * 	<tr><td><br></td><td>manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>uplnd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6220.Sls_Schd_Upd05_IVActR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsSchdService)MSBBL_SlsSchdService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}