package mcframe.serverMSBH.MSBHL5120;

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
 * "MSBHL_ApXrateRevService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_ApXrateRevService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBH";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBHL5120";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_ApXrateRevService.XrateRev_Ins01 aXrateRev_Ins01;

	protected void initXrateRev_Ins01() {
		this.info = PDef.MS_MSBHL5120_XrateRev_Ins01_INFO;
		this.aXrateRev_Ins01 = ((MSBHL_ApXrateRevService)this).new XrateRev_Ins01();
	}

	public static MSBHL_ApXrateRevService.XrateRev_Ins01 crtXrateRev_Ins01() {
		MSBHL_ApXrateRevService lgc = new MSBHL_ApXrateRevService();
		lgc.initXrateRev_Ins01();
		return lgc.aXrateRev_Ins01;
	}

	protected void paramXrateRev_Ins01(MCParam p) {
		if (this.aXrateRev_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXrateRev_Ins01.up0());
	}

	protected void doXrateRev_Ins01() {
		aXrateRev_Ins01.call();
	};

	/**
	 * XrateRev_Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5120.XrateRev_Ins01_CndR createXrateRev_Ins01_CndR(){
		return mcframe.serverMSBH.MSBHL5120.XrateRev_Ins01_CndR.create();
	}
	protected MSBHL_ApXrateRevService.XrateRev_Del01 aXrateRev_Del01;

	protected void initXrateRev_Del01() {
		this.info = PDef.MS_MSBHL5120_XrateRev_Del01_INFO;
		this.aXrateRev_Del01 = ((MSBHL_ApXrateRevService)this).new XrateRev_Del01();
	}

	public static MSBHL_ApXrateRevService.XrateRev_Del01 crtXrateRev_Del01() {
		MSBHL_ApXrateRevService lgc = new MSBHL_ApXrateRevService();
		lgc.initXrateRev_Del01();
		return lgc.aXrateRev_Del01;
	}

	protected void paramXrateRev_Del01(MCParam p) {
		if (this.aXrateRev_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXrateRev_Del01.up0());
	}

	protected void doXrateRev_Del01() {
		aXrateRev_Del01.call();
	};

	/**
	 * XrateRev_Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5120.XrateRev_Del01_CndR createXrateRev_Del01_CndR(){
		return mcframe.serverMSBH.MSBHL5120.XrateRev_Del01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * XrateRev_Ins01オペレーション.<p>
	 *
	 * 為替レート評価替の結果を為替レート評価替履歴、為替差損益に登録する<br>
	 */
	abstract public class XrateRev_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XrateRev_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5120.XrateRev_Ins01_CndR up0;
		
		
		// コンストラクタ
		protected XrateRev_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL5120.XrateRev_Ins01_CndR.create();

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
			invoke((MSBHL_ApXrateRevService)MSBHL_ApXrateRevService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * XrateRev_Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5120.XrateRev_Ins01_CndR createXrateRev_Ins01_CndR(){
			return mcframe.serverMSBH.MSBHL5120.XrateRev_Ins01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_ym</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5120.XrateRev_Ins01_CndR
		 */
		public mcframe.serverMSBH.MSBHL5120.XrateRev_Ins01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApXrateRevService)MSBHL_ApXrateRevService_MC_A.this).info;
		}


	}
	/**
	 * XrateRev_Del01オペレーション.<p>
	 *
	 * 為替レート評価替の取消処理を実行する<br>
	 */
	abstract public class XrateRev_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XrateRev_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5120.XrateRev_Del01_CndR up0;
		
		
		// コンストラクタ
		protected XrateRev_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL5120.XrateRev_Del01_CndR.create();

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
			invoke((MSBHL_ApXrateRevService)MSBHL_ApXrateRevService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * XrateRev_Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5120.XrateRev_Del01_CndR createXrateRev_Del01_CndR(){
			return mcframe.serverMSBH.MSBHL5120.XrateRev_Del01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tgt_ym</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5120.XrateRev_Del01_CndR
		 */
		public mcframe.serverMSBH.MSBHL5120.XrateRev_Del01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_ApXrateRevService)MSBHL_ApXrateRevService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}