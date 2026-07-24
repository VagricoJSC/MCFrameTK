package mcframe.serverMSBB.MSBBL6260;

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
 * "MSBBL_SlsSlipSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBL_SlsSlipSendIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBBL6260";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBL_SlsSlipSendIfService.SlsSlipSendIf_Upd01 aSlsSlipSendIf_Upd01;

	protected void initSlsSlipSendIf_Upd01() {
		this.info = PDef.MS_MSBBL6260_SlsSlipSendIf_Upd01_INFO;
		this.aSlsSlipSendIf_Upd01 = ((MSBBL_SlsSlipSendIfService)this).new SlsSlipSendIf_Upd01();
	}

	public static MSBBL_SlsSlipSendIfService.SlsSlipSendIf_Upd01 crtSlsSlipSendIf_Upd01() {
		MSBBL_SlsSlipSendIfService lgc = new MSBBL_SlsSlipSendIfService();
		lgc.initSlsSlipSendIf_Upd01();
		return lgc.aSlsSlipSendIf_Upd01;
	}

	protected void paramSlsSlipSendIf_Upd01(MCParam p) {
		if (this.aSlsSlipSendIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsSlipSendIf_Upd01.up0());
	}

	protected void doSlsSlipSendIf_Upd01() {
		aSlsSlipSendIf_Upd01.call();
	};

	/**
	 * SlsSlipSendIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd01_DtlR createSlsSlipSendIf_Upd01_DtlR(){
		return mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd01_DtlR.create();
	}

	/**
	 * SlsSlipSendIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd01_DtlR> createSlsSlipSendIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd01_DtlR.class);
	}
	protected MSBBL_SlsSlipSendIfService.SlsSlipSendIf_Upd02 aSlsSlipSendIf_Upd02;

	protected void initSlsSlipSendIf_Upd02() {
		this.info = PDef.MS_MSBBL6260_SlsSlipSendIf_Upd02_INFO;
		this.aSlsSlipSendIf_Upd02 = ((MSBBL_SlsSlipSendIfService)this).new SlsSlipSendIf_Upd02();
	}

	public static MSBBL_SlsSlipSendIfService.SlsSlipSendIf_Upd02 crtSlsSlipSendIf_Upd02() {
		MSBBL_SlsSlipSendIfService lgc = new MSBBL_SlsSlipSendIfService();
		lgc.initSlsSlipSendIf_Upd02();
		return lgc.aSlsSlipSendIf_Upd02;
	}

	protected void paramSlsSlipSendIf_Upd02(MCParam p) {
		if (this.aSlsSlipSendIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsSlipSendIf_Upd02.up0());
	}

	protected void doSlsSlipSendIf_Upd02() {
		aSlsSlipSendIf_Upd02.call();
	};

	/**
	 * SlsSlipSendIf_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd02_DtlR createSlsSlipSendIf_Upd02_DtlR(){
		return mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd02_DtlR.create();
	}

	/**
	 * SlsSlipSendIf_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd02_DtlR> createSlsSlipSendIf_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd02_DtlR.class);
	}
	protected MSBBL_SlsSlipSendIfService.SlsSlipSendIf_Upd03 aSlsSlipSendIf_Upd03;

	protected void initSlsSlipSendIf_Upd03() {
		this.info = PDef.MS_MSBBL6260_SlsSlipSendIf_Upd03_INFO;
		this.aSlsSlipSendIf_Upd03 = ((MSBBL_SlsSlipSendIfService)this).new SlsSlipSendIf_Upd03();
	}

	public static MSBBL_SlsSlipSendIfService.SlsSlipSendIf_Upd03 crtSlsSlipSendIf_Upd03() {
		MSBBL_SlsSlipSendIfService lgc = new MSBBL_SlsSlipSendIfService();
		lgc.initSlsSlipSendIf_Upd03();
		return lgc.aSlsSlipSendIf_Upd03;
	}

	protected void paramSlsSlipSendIf_Upd03(MCParam p) {
		if (this.aSlsSlipSendIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlsSlipSendIf_Upd03.up0());
	}

	protected void doSlsSlipSendIf_Upd03() {
		aSlsSlipSendIf_Upd03.call();
	};

	/**
	 * SlsSlipSendIf_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd03_DtlR createSlsSlipSendIf_Upd03_DtlR(){
		return mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd03_DtlR.create();
	}

	/**
	 * SlsSlipSendIf_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd03_DtlR> createSlsSlipSendIf_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd03_DtlR.class);
	}
	protected MSBBL_SlsSlipSendIfService.SlsSlipSendIf_Upd04 aSlsSlipSendIf_Upd04;

	protected void initSlsSlipSendIf_Upd04() {
		this.info = PDef.MS_MSBBL6260_SlsSlipSendIf_Upd04_INFO;
		this.aSlsSlipSendIf_Upd04 = ((MSBBL_SlsSlipSendIfService)this).new SlsSlipSendIf_Upd04();
	}

	public static MSBBL_SlsSlipSendIfService.SlsSlipSendIf_Upd04 crtSlsSlipSendIf_Upd04() {
		MSBBL_SlsSlipSendIfService lgc = new MSBBL_SlsSlipSendIfService();
		lgc.initSlsSlipSendIf_Upd04();
		return lgc.aSlsSlipSendIf_Upd04;
	}

	protected void paramSlsSlipSendIf_Upd04(MCParam p) {
		if (this.aSlsSlipSendIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
	}

	protected void doSlsSlipSendIf_Upd04() {
		aSlsSlipSendIf_Upd04.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SlsSlipSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の売上伝票をＩＦテーブルに書き込み、送信する<br>
	 */
	abstract public class SlsSlipSendIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsSlipSendIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected SlsSlipSendIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd01_DtlR.class);

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
			invoke((MSBBL_SlsSlipSendIfService)MSBBL_SlsSlipSendIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SlsSlipSendIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd01_DtlR createSlsSlipSendIf_Upd01_DtlR(){
			return mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd01_DtlR.create();
		}

		/**
		 * SlsSlipSendIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd01_DtlR> createSlsSlipSendIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>prov_act_seq</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsSlipSendIfService)MSBBL_SlsSlipSendIfService_MC_A.this).info;
		}


	}
	/**
	 * SlsSlipSendIf_Upd02オペレーション.<p>
	 *
	 * 売上伝票を再送信する<br>
	 */
	abstract public class SlsSlipSendIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsSlipSendIf_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd02_DtlR> up0;
		
		
		// コンストラクタ
		protected SlsSlipSendIf_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd02_DtlR.class);

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
			invoke((MSBBL_SlsSlipSendIfService)MSBBL_SlsSlipSendIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SlsSlipSendIf_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd02_DtlR createSlsSlipSendIf_Upd02_DtlR(){
			return mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd02_DtlR.create();
		}

		/**
		 * SlsSlipSendIf_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd02_DtlR> createSlsSlipSendIf_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd02_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsSlipSendIfService)MSBBL_SlsSlipSendIfService_MC_A.this).info;
		}


	}
	/**
	 * SlsSlipSendIf_Upd03オペレーション.<p>
	 *
	 * 売上伝票を送信対象外にする<br>
	 */
	abstract public class SlsSlipSendIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsSlipSendIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd03_DtlR> up0;
		
		
		// コンストラクタ
		protected SlsSlipSendIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd03_DtlR.class);

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
			invoke((MSBBL_SlsSlipSendIfService)MSBBL_SlsSlipSendIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SlsSlipSendIf_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd03_DtlR createSlsSlipSendIf_Upd03_DtlR(){
			return mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd03_DtlR.create();
		}

		/**
		 * SlsSlipSendIf_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd03_DtlR> createSlsSlipSendIf_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd03_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>not_snd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6260.SlsSlipSendIf_Upd03_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsSlipSendIfService)MSBBL_SlsSlipSendIfService_MC_A.this).info;
		}


	}
	/**
	 * SlsSlipSendIf_Upd04オペレーション.<p>
	 *
	 * 売上伝票を送信する<br>
	 */
	abstract public class SlsSlipSendIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SlsSlipSendIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		
		
		// コンストラクタ
		protected SlsSlipSendIf_Upd04() {
			
			// このオペレーションのコンテナ初期化

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_SlsSlipSendIfService)MSBBL_SlsSlipSendIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		//-------------------------外部 I/F--------------------------



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsSlipSendIfService)MSBBL_SlsSlipSendIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}