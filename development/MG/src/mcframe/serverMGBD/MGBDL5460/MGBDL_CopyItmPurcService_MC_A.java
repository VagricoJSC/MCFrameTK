package mcframe.serverMGBD.MGBDL5460;

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
 * "MGBDL_CopyItmPurcService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDL_CopyItmPurcService_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String LOGIC_ID = "MGBDL5460";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBDL_CopyItmPurcService.CopyItmPurc_Ins01 aCopyItmPurc_Ins01;

	protected void initCopyItmPurc_Ins01() {
		this.info = PDef.MG_MGBDL5460_CopyItmPurc_Ins01_INFO;
		this.aCopyItmPurc_Ins01 = ((MGBDL_CopyItmPurcService)this).new CopyItmPurc_Ins01();
	}

	public static MGBDL_CopyItmPurcService.CopyItmPurc_Ins01 crtCopyItmPurc_Ins01() {
		MGBDL_CopyItmPurcService lgc = new MGBDL_CopyItmPurcService();
		lgc.initCopyItmPurc_Ins01();
		return lgc.aCopyItmPurc_Ins01;
	}

	protected void paramCopyItmPurc_Ins01(MCParam p) {
		if (this.aCopyItmPurc_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCopyItmPurc_Ins01.up0());
	}

	protected void doCopyItmPurc_Ins01() {
		aCopyItmPurc_Ins01.call();
	};

	/**
	 * CopyItmPurc_Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Ins01_CndR createCopyItmPurc_Ins01_CndR(){
		return mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Ins01_CndR.create();
	}
	protected MGBDL_CopyItmPurcService.CopyItmPurc_Upd01 aCopyItmPurc_Upd01;

	protected void initCopyItmPurc_Upd01() {
		this.info = PDef.MG_MGBDL5460_CopyItmPurc_Upd01_INFO;
		this.aCopyItmPurc_Upd01 = ((MGBDL_CopyItmPurcService)this).new CopyItmPurc_Upd01();
	}

	public static MGBDL_CopyItmPurcService.CopyItmPurc_Upd01 crtCopyItmPurc_Upd01() {
		MGBDL_CopyItmPurcService lgc = new MGBDL_CopyItmPurcService();
		lgc.initCopyItmPurc_Upd01();
		return lgc.aCopyItmPurc_Upd01;
	}

	protected void paramCopyItmPurc_Upd01(MCParam p) {
		if (this.aCopyItmPurc_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCopyItmPurc_Upd01.up0());
	}

	protected void doCopyItmPurc_Upd01() {
		aCopyItmPurc_Upd01.call();
	};

	/**
	 * CopyItmPurc_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlR createCopyItmPurc_Upd01_DtlR(){
		return mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlR.create();
	}

	/**
	 * CopyItmPurc_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlL<mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlR> createCopyItmPurc_Upd01_DtlL(){
		return mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlL.createMG_MGBDL5460_CopyItmPurc_Upd01_Dtl(mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlR.class);
	}
	protected MGBDL_CopyItmPurcService.CopyItmPurc_Upd02 aCopyItmPurc_Upd02;

	protected void initCopyItmPurc_Upd02() {
		this.info = PDef.MG_MGBDL5460_CopyItmPurc_Upd02_INFO;
		this.aCopyItmPurc_Upd02 = ((MGBDL_CopyItmPurcService)this).new CopyItmPurc_Upd02();
	}

	public static MGBDL_CopyItmPurcService.CopyItmPurc_Upd02 crtCopyItmPurc_Upd02() {
		MGBDL_CopyItmPurcService lgc = new MGBDL_CopyItmPurcService();
		lgc.initCopyItmPurc_Upd02();
		return lgc.aCopyItmPurc_Upd02;
	}

	protected void paramCopyItmPurc_Upd02(MCParam p) {
		if (this.aCopyItmPurc_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCopyItmPurc_Upd02.up0());
	}

	protected void doCopyItmPurc_Upd02() {
		aCopyItmPurc_Upd02.call();
	};

	/**
	 * CopyItmPurc_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Ins01_CndR createCopyItmPurc_Upd02_CndR(){
		return mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Ins01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * CopyItmPurc_Ins01オペレーション.<p>
	 *
	 * 原価品目購買単価取込対象を作成します。<br>
	 */
	abstract public class CopyItmPurc_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CopyItmPurc_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Ins01_CndR up0;
		
		
		// コンストラクタ
		protected CopyItmPurc_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Ins01_CndR.create();

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
			invoke((MGBDL_CopyItmPurcService)MGBDL_CopyItmPurcService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CopyItmPurc_Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Ins01_CndR createCopyItmPurc_Ins01_CndR(){
			return mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Ins01_CndR.create();
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
		 * 	<tr><td><br></td><td>lump_flg</td></tr>
		 * 	<tr><td><br></td><td>imp_ope_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Ins01_CndR
		 */
		public mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Ins01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CopyItmPurcService)MGBDL_CopyItmPurcService_MC_A.this).info;
		}


	}
	/**
	 * CopyItmPurc_Upd01オペレーション.<p>
	 *
	 * 原価品目購買単価取込対象から原価品目購買単価へ取り込みます。<br>
	 */
	abstract public class CopyItmPurc_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CopyItmPurc_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlL<mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected CopyItmPurc_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlL.createMG_MGBDL5460_CopyItmPurc_Upd01_Dtl(mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlR.class);

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
			invoke((MGBDL_CopyItmPurcService)MGBDL_CopyItmPurcService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CopyItmPurc_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlR createCopyItmPurc_Upd01_DtlR(){
			return mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlR.create();
		}

		/**
		 * CopyItmPurc_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlL<mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlR> createCopyItmPurc_Upd01_DtlL(){
			return mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlL.createMG_MGBDL5460_CopyItmPurc_Upd01_Dtl(mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlR.class);
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
		 * @see mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlL
		 */
		public mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlL<mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CopyItmPurcService)MGBDL_CopyItmPurcService_MC_A.this).info;
		}


	}
	/**
	 * CopyItmPurc_Upd02オペレーション.<p>
	 *
	 * 原価品目詳購買単価込対象から全て原価品目購買単価へ取り込みます。<br>
	 */
	abstract public class CopyItmPurc_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CopyItmPurc_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Ins01_CndR up0;
		
		
		// コンストラクタ
		protected CopyItmPurc_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Ins01_CndR.create();

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
			invoke((MGBDL_CopyItmPurcService)MGBDL_CopyItmPurcService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CopyItmPurc_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Ins01_CndR createCopyItmPurc_Upd02_CndR(){
			return mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Ins01_CndR.create();
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
		 * @see mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Ins01_CndR
		 */
		public mcframe.serverMGBD.MGBDL5460.CopyItmPurc_Ins01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_CopyItmPurcService)MGBDL_CopyItmPurcService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}