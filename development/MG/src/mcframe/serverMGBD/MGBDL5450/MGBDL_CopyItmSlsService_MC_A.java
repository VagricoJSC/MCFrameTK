package mcframe.serverMGBD.MGBDL5450;

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
 * "MGBDL_CopyItmSlsService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDL_CopyItmSlsService_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MGBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBDL5450";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBDL_CopyItmSlsService.CopyItmSls_Ins01 aCopyItmSls_Ins01;

	protected void initCopyItmSls_Ins01() {
		this.info = PDef.MG_MGBDL5450_CopyItmSls_Ins01_INFO;
		this.aCopyItmSls_Ins01 = ((MGBDL_CopyItmSlsService)this).new CopyItmSls_Ins01();
	}

	public static MGBDL_CopyItmSlsService.CopyItmSls_Ins01 crtCopyItmSls_Ins01() {
		MGBDL_CopyItmSlsService lgc = new MGBDL_CopyItmSlsService();
		lgc.initCopyItmSls_Ins01();
		return lgc.aCopyItmSls_Ins01;
	}

	protected void paramCopyItmSls_Ins01(MCParam p) {
		if (this.aCopyItmSls_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCopyItmSls_Ins01.up0());
	}

	protected void doCopyItmSls_Ins01() {
		aCopyItmSls_Ins01.call();
	};

	/**
	 * CopyItmSls_Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR createCopyItmSls_Ins01_CndR(){
		return mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR.create();
	}
	protected MGBDL_CopyItmSlsService.CopyItmSls_Upd01 aCopyItmSls_Upd01;

	protected void initCopyItmSls_Upd01() {
		this.info = PDef.MG_MGBDL5450_CopyItmSls_Upd01_INFO;
		this.aCopyItmSls_Upd01 = ((MGBDL_CopyItmSlsService)this).new CopyItmSls_Upd01();
	}

	public static MGBDL_CopyItmSlsService.CopyItmSls_Upd01 crtCopyItmSls_Upd01() {
		MGBDL_CopyItmSlsService lgc = new MGBDL_CopyItmSlsService();
		lgc.initCopyItmSls_Upd01();
		return lgc.aCopyItmSls_Upd01;
	}

	protected void paramCopyItmSls_Upd01(MCParam p) {
		if (this.aCopyItmSls_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCopyItmSls_Upd01.up0());
	}

	protected void doCopyItmSls_Upd01() {
		aCopyItmSls_Upd01.call();
	};

	/**
	 * CopyItmSls_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR createCopyItmSls_Upd01_DtlR(){
		return mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR.create();
	}

	/**
	 * CopyItmSls_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlL<mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR> createCopyItmSls_Upd01_DtlL(){
		return mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlL.createMG_MGBDL5450_CopyItmSls_Upd01_Dtl(mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR.class);
	}
	protected MGBDL_CopyItmSlsService.CopyItmSls_Upd02 aCopyItmSls_Upd02;

	protected void initCopyItmSls_Upd02() {
		this.info = PDef.MG_MGBDL5450_CopyItmSls_Upd02_INFO;
		this.aCopyItmSls_Upd02 = ((MGBDL_CopyItmSlsService)this).new CopyItmSls_Upd02();
	}

	public static MGBDL_CopyItmSlsService.CopyItmSls_Upd02 crtCopyItmSls_Upd02() {
		MGBDL_CopyItmSlsService lgc = new MGBDL_CopyItmSlsService();
		lgc.initCopyItmSls_Upd02();
		return lgc.aCopyItmSls_Upd02;
	}

	protected void paramCopyItmSls_Upd02(MCParam p) {
		if (this.aCopyItmSls_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCopyItmSls_Upd02.up0());
	}

	protected void doCopyItmSls_Upd02() {
		aCopyItmSls_Upd02.call();
	};

	/**
	 * CopyItmSls_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR createCopyItmSls_Upd02_CndR(){
		return mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * CopyItmSls_Ins01オペレーション.<p>
	 *
	 * 原価品目販売単価取込対象を作成します。<br>
	 */
	abstract public class CopyItmSls_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CopyItmSls_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR up0;
		
		
		// コンストラクタ
		protected CopyItmSls_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR.create();

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
			invoke((MGBDL_CopyItmSlsService)MGBDL_CopyItmSlsService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CopyItmSls_Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR createCopyItmSls_Ins01_CndR(){
			return mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR.create();
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
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_imp_typ</td></tr>
		 * 	<tr><td><br></td><td>lump_flg</td></tr>
		 * 	<tr><td><br></td><td>imp_ope_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR
		 */
		public mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CopyItmSlsService)MGBDL_CopyItmSlsService_MC_A.this).info;
		}


	}
	/**
	 * CopyItmSls_Upd01オペレーション.<p>
	 *
	 * 原価品目販売単価取込対象から原価品目販売単価へ取り込みます。<br>
	 */
	abstract public class CopyItmSls_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CopyItmSls_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlL<mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected CopyItmSls_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlL.createMG_MGBDL5450_CopyItmSls_Upd01_Dtl(mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR.class);

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
			invoke((MGBDL_CopyItmSlsService)MGBDL_CopyItmSlsService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CopyItmSls_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR createCopyItmSls_Upd01_DtlR(){
			return mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR.create();
		}

		/**
		 * CopyItmSls_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlL<mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR> createCopyItmSls_Upd01_DtlL(){
			return mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlL.createMG_MGBDL5450_CopyItmSls_Upd01_Dtl(mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR.class);
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
		 * 	<tr><td><br></td><td>term</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlL
		 */
		public mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlL<mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CopyItmSlsService)MGBDL_CopyItmSlsService_MC_A.this).info;
		}


	}
	/**
	 * CopyItmSls_Upd02オペレーション.<p>
	 *
	 * 原価品目販売単価取込対象から全て原価品目販売単価へ取り込みます。<br>
	 */
	abstract public class CopyItmSls_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CopyItmSls_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR up0;
		
		
		// コンストラクタ
		protected CopyItmSls_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR.create();

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
			invoke((MGBDL_CopyItmSlsService)MGBDL_CopyItmSlsService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CopyItmSls_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR createCopyItmSls_Upd02_CndR(){
			return mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR.create();
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
		 * 	<tr><td><br></td><td>term</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR
		 */
		public mcframe.serverMGBD.MGBDL5450.CopyItmSls_Ins01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CopyItmSlsService)MGBDL_CopyItmSlsService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}