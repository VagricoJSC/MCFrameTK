package mcframe.serverMSBE.MSBEL5030;

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
 * "MSBEL_StkMngService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_StkMngService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL5030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_StkMngService.Stk_Upd01 aStk_Upd01;

	protected void initStk_Upd01() {
		this.info = PDef.MS_MSBEL5030_Stk_Upd01_INFO;
		this.aStk_Upd01 = ((MSBEL_StkMngService)this).new Stk_Upd01();
	}

	public static MSBEL_StkMngService.Stk_Upd01 crtStk_Upd01() {
		MSBEL_StkMngService lgc = new MSBEL_StkMngService();
		lgc.initStk_Upd01();
		return lgc.aStk_Upd01;
	}

	protected void paramStk_Upd01(MCParam p) {
		if (this.aStk_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStk_Upd01.up0());
	}

	protected void doStk_Upd01() {
		aStk_Upd01.call();
	};

	/**
	 * Stk_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5030.Stk_Upd01_DtlR createStk_Upd01_DtlR(){
		return mcframe.serverMSBE.MSBEL5030.Stk_Upd01_DtlR.create();
	}

	/**
	 * Stk_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5030.Stk_Upd01_DtlR> createStk_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5030.Stk_Upd01_DtlR.class);
	}
	protected MSBEL_StkMngService.Stk_Upd02 aStk_Upd02;

	protected void initStk_Upd02() {
		this.info = PDef.MS_MSBEL5030_Stk_Upd02_INFO;
		this.aStk_Upd02 = ((MSBEL_StkMngService)this).new Stk_Upd02();
	}

	public static MSBEL_StkMngService.Stk_Upd02 crtStk_Upd02() {
		MSBEL_StkMngService lgc = new MSBEL_StkMngService();
		lgc.initStk_Upd02();
		return lgc.aStk_Upd02;
	}

	protected void paramStk_Upd02(MCParam p) {
		if (this.aStk_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aStk_Upd02.up0());
	}

	protected void doStk_Upd02() {
		aStk_Upd02.call();
	};

	/**
	 * Stk_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5030.Stk_Upd02_CndR createStk_Upd02_CndR(){
		return mcframe.serverMSBE.MSBEL5030.Stk_Upd02_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Stk_Upd01オペレーション.<p>
	 *
	 * 受払実績に基づいて現状在庫・月次在庫を更新します。<br>
	 */
	abstract public class Stk_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Stk_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5030.Stk_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected Stk_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5030.Stk_Upd01_DtlR.class);

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
			invoke((MSBEL_StkMngService)MSBEL_StkMngService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Stk_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5030.Stk_Upd01_DtlR createStk_Upd01_DtlR(){
			return mcframe.serverMSBE.MSBEL5030.Stk_Upd01_DtlR.create();
		}

		/**
		 * Stk_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5030.Stk_Upd01_DtlR> createStk_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5030.Stk_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>io_act_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>minus_stk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5030.Stk_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StkMngService)MSBEL_StkMngService_MC_A.this).info;
		}


	}
	/**
	 * Stk_Upd02オペレーション.<p>
	 *
	 * 指定月の月次受払在庫から翌月の月次受払在庫を作成します。<br>
	 */
	abstract public class Stk_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Stk_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5030.Stk_Upd02_CndR up0;
		
		
		// コンストラクタ
		protected Stk_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5030.Stk_Upd02_CndR.create();

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
			invoke((MSBEL_StkMngService)MSBEL_StkMngService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Stk_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5030.Stk_Upd02_CndR createStk_Upd02_CndR(){
			return mcframe.serverMSBE.MSBEL5030.Stk_Upd02_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5030.Stk_Upd02_CndR
		 */
		public mcframe.serverMSBE.MSBEL5030.Stk_Upd02_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_StkMngService)MSBEL_StkMngService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}