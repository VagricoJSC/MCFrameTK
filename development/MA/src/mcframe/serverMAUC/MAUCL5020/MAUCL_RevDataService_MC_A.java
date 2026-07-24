package mcframe.serverMAUC.MAUCL5020;

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
 * "MAUCL_RevDataService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUCL_RevDataService_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MAUC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MAUCL5020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MAUCL_RevDataService.RevData_Ins01 aRevData_Ins01;

	protected void initRevData_Ins01() {
		this.info = PDef.MA_MAUCL5020_RevData_Ins01_INFO;
		this.aRevData_Ins01 = ((MAUCL_RevDataService)this).new RevData_Ins01();
	}

	public static MAUCL_RevDataService.RevData_Ins01 crtRevData_Ins01() {
		MAUCL_RevDataService lgc = new MAUCL_RevDataService();
		lgc.initRevData_Ins01();
		return lgc.aRevData_Ins01;
	}

	protected void paramRevData_Ins01(MCParam p) {
		if (this.aRevData_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRevData_Ins01.up0());
	}

	protected void doRevData_Ins01() {
		aRevData_Ins01.call();
	};

	/**
	 * RevData_Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5020.RevData_Ins01_DtlR createRevData_Ins01_DtlR(){
		return mcframe.serverMAUC.MAUCL5020.RevData_Ins01_DtlR.create();
	}

	/**
	 * RevData_Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Ins01_DtlR> createRevData_Ins01_DtlL(){
		return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Ins01_DtlR.class);
	}
	protected MAUCL_RevDataService.RevData_Upd01 aRevData_Upd01;

	protected void initRevData_Upd01() {
		this.info = PDef.MA_MAUCL5020_RevData_Upd01_INFO;
		this.aRevData_Upd01 = ((MAUCL_RevDataService)this).new RevData_Upd01();
	}

	public static MAUCL_RevDataService.RevData_Upd01 crtRevData_Upd01() {
		MAUCL_RevDataService lgc = new MAUCL_RevDataService();
		lgc.initRevData_Upd01();
		return lgc.aRevData_Upd01;
	}

	protected void paramRevData_Upd01(MCParam p) {
		if (this.aRevData_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aRevData_Upd01.up0());
	}

	protected void doRevData_Upd01() {
		aRevData_Upd01.call();
	};

	/**
	 * RevData_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createRevData_Upd01_DtlR(){
		return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
	}

	/**
	 * RevData_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createRevData_Upd01_DtlL(){
		return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);
	}
	protected MAUCL_RevDataService.RevData_Upd02 aRevData_Upd02;

	protected void initRevData_Upd02() {
		this.info = PDef.MA_MAUCL5020_RevData_Upd02_INFO;
		this.aRevData_Upd02 = ((MAUCL_RevDataService)this).new RevData_Upd02();
	}

	public static MAUCL_RevDataService.RevData_Upd02 crtRevData_Upd02() {
		MAUCL_RevDataService lgc = new MAUCL_RevDataService();
		lgc.initRevData_Upd02();
		return lgc.aRevData_Upd02;
	}

	protected void paramRevData_Upd02(MCParam p) {
		if (this.aRevData_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
	}

	protected void doRevData_Upd02() {
		aRevData_Upd02.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * RevData_Ins01オペレーション.<p>
	 *
	 * 「改訂履歴データ更新リスト」テーブルにデータを登録します。<br>
	 */
	abstract public class RevData_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RevData_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5020.RevData_Ins01_DtlR> up0;
		
		
		// コンストラクタ
		protected RevData_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Ins01_DtlR.class);

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
			invoke((MAUCL_RevDataService)MAUCL_RevDataService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RevData_Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5020.RevData_Ins01_DtlR createRevData_Ins01_DtlR(){
			return mcframe.serverMAUC.MAUCL5020.RevData_Ins01_DtlR.create();
		}

		/**
		 * RevData_Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Ins01_DtlR> createRevData_Ins01_DtlL(){
			return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Ins01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rev_data_src_no</td></tr>
		 * 	<tr><td><br></td><td>rev_no</td></tr>
		 * 	<tr><td><br></td><td>rev_data_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Ins01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_RevDataService)MAUCL_RevDataService_MC_A.this).info;
		}


	}
	/**
	 * RevData_Upd01オペレーション.<p>
	 *
	 * 改訂履歴データを更新する処理が実装するインターフェースを定義する<br>
	 */
	abstract public class RevData_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMAUC.MAUCL5020.IfMAUCL_RevDataService_RevData_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RevData_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected RevData_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);

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
			invoke((MAUCL_RevDataService)MAUCL_RevDataService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * RevData_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createRevData_Upd01_DtlR(){
			return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
		}

		/**
		 * RevData_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createRevData_Upd01_DtlL(){
			return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rev_data_src_no</td></tr>
		 * 	<tr><td><br></td><td>rev_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_RevDataService)MAUCL_RevDataService_MC_A.this).info;
		}


	}
	/**
	 * RevData_Upd02オペレーション.<p>
	 *
	 * 改訂履歴データ更新リストテーブルのデータを元に、改訂履歴データを更新する処理を呼び出す。<br>
	 */
	abstract public class RevData_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "RevData_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		
		
		// コンストラクタ
		protected RevData_Upd02() {
			
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
			invoke((MAUCL_RevDataService)MAUCL_RevDataService_MC_A.this);
		}
		
		protected void clear() {
		}
		//-------------------------外部 I/F--------------------------



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_RevDataService)MAUCL_RevDataService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}