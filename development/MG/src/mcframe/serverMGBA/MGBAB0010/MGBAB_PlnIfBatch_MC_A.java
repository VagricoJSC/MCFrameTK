package mcframe.serverMGBA.MGBAB0010;

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
 * "MGBAB_PlnIfBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBAB_PlnIfBatch_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBAB0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBAB_PlnIfBatch.PlnIf_Upd01 aPlnIf_Upd01;

	protected void initPlnIf_Upd01() {
		this.info = PDef.MG_MGBAB0010_PlnIf_Upd01_INFO;
		this.aPlnIf_Upd01 = ((MGBAB_PlnIfBatch)this).new PlnIf_Upd01();
	}

	public static MGBAB_PlnIfBatch.PlnIf_Upd01 crtPlnIf_Upd01() {
		MGBAB_PlnIfBatch lgc = new MGBAB_PlnIfBatch();
		lgc.initPlnIf_Upd01();
		return lgc.aPlnIf_Upd01;
	}

	protected void paramPlnIf_Upd01(MCParam p) {
		if (this.aPlnIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPlnIf_Upd01.up0());
	}

	protected void doPlnIf_Upd01() {
		aPlnIf_Upd01.call();
	};

	/**
	 * PlnIf_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBA.MGBAB0010.PlnIf_Upd01_CndR createPlnIf_Upd01_CndR(){
		return mcframe.serverMGBA.MGBAB0010.PlnIf_Upd01_CndR.create();
	}
	protected MGBAB_PlnIfBatch.PlnIf_Upd02 aPlnIf_Upd02;

	protected void initPlnIf_Upd02() {
		this.info = PDef.MG_MGBAB0010_PlnIf_Upd02_INFO;
		this.aPlnIf_Upd02 = ((MGBAB_PlnIfBatch)this).new PlnIf_Upd02();
	}

	public static MGBAB_PlnIfBatch.PlnIf_Upd02 crtPlnIf_Upd02() {
		MGBAB_PlnIfBatch lgc = new MGBAB_PlnIfBatch();
		lgc.initPlnIf_Upd02();
		return lgc.aPlnIf_Upd02;
	}

	protected void paramPlnIf_Upd02(MCParam p) {
		if (this.aPlnIf_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPlnIf_Upd02.up0());
	}

	protected void doPlnIf_Upd02() {
		aPlnIf_Upd02.call();
	};

	/**
	 * PlnIf_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBA.MGBAB0010.PlnIf_Upd02_CndR createPlnIf_Upd02_CndR(){
		return mcframe.serverMGBA.MGBAB0010.PlnIf_Upd02_CndR.create();
	}
	protected MGBAB_PlnIfBatch.PlnIf_Upd03 aPlnIf_Upd03;

	protected void initPlnIf_Upd03() {
		this.info = PDef.MG_MGBAB0010_PlnIf_Upd03_INFO;
		this.aPlnIf_Upd03 = ((MGBAB_PlnIfBatch)this).new PlnIf_Upd03();
	}

	public static MGBAB_PlnIfBatch.PlnIf_Upd03 crtPlnIf_Upd03() {
		MGBAB_PlnIfBatch lgc = new MGBAB_PlnIfBatch();
		lgc.initPlnIf_Upd03();
		return lgc.aPlnIf_Upd03;
	}

	protected void paramPlnIf_Upd03(MCParam p) {
		if (this.aPlnIf_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPlnIf_Upd03.up0());
	}

	protected void doPlnIf_Upd03() {
		aPlnIf_Upd03.call();
	};

	/**
	 * PlnIf_Upd03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBA.MGBAB0010.PlnIf_Upd03_CndR createPlnIf_Upd03_CndR(){
		return mcframe.serverMGBA.MGBAB0010.PlnIf_Upd03_CndR.create();
	}
	protected MGBAB_PlnIfBatch.PlnIf_Upd04 aPlnIf_Upd04;

	protected void initPlnIf_Upd04() {
		this.info = PDef.MG_MGBAB0010_PlnIf_Upd04_INFO;
		this.aPlnIf_Upd04 = ((MGBAB_PlnIfBatch)this).new PlnIf_Upd04();
	}

	public static MGBAB_PlnIfBatch.PlnIf_Upd04 crtPlnIf_Upd04() {
		MGBAB_PlnIfBatch lgc = new MGBAB_PlnIfBatch();
		lgc.initPlnIf_Upd04();
		return lgc.aPlnIf_Upd04;
	}

	protected void paramPlnIf_Upd04(MCParam p) {
		if (this.aPlnIf_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPlnIf_Upd04.up0());
	}

	protected void doPlnIf_Upd04() {
		aPlnIf_Upd04.call();
	};

	/**
	 * PlnIf_Upd04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBA.MGBAB0010.PlnIf_Upd04_CndR createPlnIf_Upd04_CndR(){
		return mcframe.serverMGBA.MGBAB0010.PlnIf_Upd04_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PlnIf_Upd01オペレーション.<p>
	 *
	 * 売上計画の取込処理をする<br>
	 */
	abstract public class PlnIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PlnIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBA.MGBAB0010.PlnIf_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected PlnIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBA.MGBAB0010.PlnIf_Upd01_CndR.create();

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
			invoke((MGBAB_PlnIfBatch)MGBAB_PlnIfBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PlnIf_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBA.MGBAB0010.PlnIf_Upd01_CndR createPlnIf_Upd01_CndR(){
			return mcframe.serverMGBA.MGBAB0010.PlnIf_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>sls_pln_imp_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBA.MGBAB0010.PlnIf_Upd01_CndR
		 */
		public mcframe.serverMGBA.MGBAB0010.PlnIf_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBAB_PlnIfBatch)MGBAB_PlnIfBatch_MC_A.this).info;
		}


	}
	/**
	 * PlnIf_Upd02オペレーション.<p>
	 *
	 * 月次計画の取込処理をする<br>
	 */
	abstract public class PlnIf_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PlnIf_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBA.MGBAB0010.PlnIf_Upd02_CndR up0;
		
		
		// コンストラクタ
		protected PlnIf_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBA.MGBAB0010.PlnIf_Upd02_CndR.create();

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
			invoke((MGBAB_PlnIfBatch)MGBAB_PlnIfBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PlnIf_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBA.MGBAB0010.PlnIf_Upd02_CndR createPlnIf_Upd02_CndR(){
			return mcframe.serverMGBA.MGBAB0010.PlnIf_Upd02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>rqmt_pln_imp_typ</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBA.MGBAB0010.PlnIf_Upd02_CndR
		 */
		public mcframe.serverMGBA.MGBAB0010.PlnIf_Upd02_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBAB_PlnIfBatch)MGBAB_PlnIfBatch_MC_A.this).info;
		}


	}
	/**
	 * PlnIf_Upd03オペレーション.<p>
	 *
	 * 製造計画の取込処理をする<br>
	 */
	abstract public class PlnIf_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PlnIf_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBA.MGBAB0010.PlnIf_Upd03_CndR up0;
		
		
		// コンストラクタ
		protected PlnIf_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBA.MGBAB0010.PlnIf_Upd03_CndR.create();

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
			invoke((MGBAB_PlnIfBatch)MGBAB_PlnIfBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PlnIf_Upd03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBA.MGBAB0010.PlnIf_Upd03_CndR createPlnIf_Upd03_CndR(){
			return mcframe.serverMGBA.MGBAB0010.PlnIf_Upd03_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>mfg_pln_imp_typ</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBA.MGBAB0010.PlnIf_Upd03_CndR
		 */
		public mcframe.serverMGBA.MGBAB0010.PlnIf_Upd03_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBAB_PlnIfBatch)MGBAB_PlnIfBatch_MC_A.this).info;
		}


	}
	/**
	 * PlnIf_Upd04オペレーション.<p>
	 *
	 * 購買計画の取込処理をする<br>
	 */
	abstract public class PlnIf_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PlnIf_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBA.MGBAB0010.PlnIf_Upd04_CndR up0;
		
		
		// コンストラクタ
		protected PlnIf_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBA.MGBAB0010.PlnIf_Upd04_CndR.create();

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
			invoke((MGBAB_PlnIfBatch)MGBAB_PlnIfBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PlnIf_Upd04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBA.MGBAB0010.PlnIf_Upd04_CndR createPlnIf_Upd04_CndR(){
			return mcframe.serverMGBA.MGBAB0010.PlnIf_Upd04_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>purc_pln_imp_typ</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBA.MGBAB0010.PlnIf_Upd04_CndR
		 */
		public mcframe.serverMGBA.MGBAB0010.PlnIf_Upd04_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBAB_PlnIfBatch)MGBAB_PlnIfBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}