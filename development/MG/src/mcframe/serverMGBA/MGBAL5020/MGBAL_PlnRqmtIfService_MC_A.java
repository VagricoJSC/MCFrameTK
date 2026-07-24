package mcframe.serverMGBA.MGBAL5020;

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
 * "MGBAL_PlnRqmtIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBAL_PlnRqmtIfService_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String LOGIC_ID = "MGBAL5020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBAL_PlnRqmtIfService.PlnRqmtIf_Chk01 aPlnRqmtIf_Chk01;

	protected void initPlnRqmtIf_Chk01() {
		this.info = PDef.MG_MGBAL5020_PlnRqmtIf_Chk01_INFO;
		this.aPlnRqmtIf_Chk01 = ((MGBAL_PlnRqmtIfService)this).new PlnRqmtIf_Chk01();
	}

	public static MGBAL_PlnRqmtIfService.PlnRqmtIf_Chk01 crtPlnRqmtIf_Chk01() {
		MGBAL_PlnRqmtIfService lgc = new MGBAL_PlnRqmtIfService();
		lgc.initPlnRqmtIf_Chk01();
		return lgc.aPlnRqmtIf_Chk01;
	}

	protected void paramPlnRqmtIf_Chk01(MCParam p) {
		if (this.aPlnRqmtIf_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPlnRqmtIf_Chk01.up0());
		p.addDownBlock(aPlnRqmtIf_Chk01.down0());
	}

	protected void doPlnRqmtIf_Chk01() {
		aPlnRqmtIf_Chk01.call();
	};

	/**
	 * PlnRqmtIf_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR createPlnRqmtIf_Chk01_CndR(){
		return mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR.create();
	}
	protected MGBAL_PlnRqmtIfService.PlnRqmtIf_Upd01 aPlnRqmtIf_Upd01;

	protected void initPlnRqmtIf_Upd01() {
		this.info = PDef.MG_MGBAL5020_PlnRqmtIf_Upd01_INFO;
		this.aPlnRqmtIf_Upd01 = ((MGBAL_PlnRqmtIfService)this).new PlnRqmtIf_Upd01();
	}

	public static MGBAL_PlnRqmtIfService.PlnRqmtIf_Upd01 crtPlnRqmtIf_Upd01() {
		MGBAL_PlnRqmtIfService lgc = new MGBAL_PlnRqmtIfService();
		lgc.initPlnRqmtIf_Upd01();
		return lgc.aPlnRqmtIf_Upd01;
	}

	protected void paramPlnRqmtIf_Upd01(MCParam p) {
		if (this.aPlnRqmtIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPlnRqmtIf_Upd01.up0());
	}

	protected void doPlnRqmtIf_Upd01() {
		aPlnRqmtIf_Upd01.call();
	};

	/**
	 * PlnRqmtIf_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR createPlnRqmtIf_Upd01_CndR(){
		return mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PlnRqmtIf_Chk01オペレーション.<p>
	 *
	 * ＳＣＭから月次計画を取り込むために、チェックを行う。<br>
	 */
	abstract public class PlnRqmtIf_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PlnRqmtIf_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected PlnRqmtIf_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR.create();
			down0 = mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR.create();

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
			invoke((MGBAL_PlnRqmtIfService)MGBAL_PlnRqmtIfService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PlnRqmtIf_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR createPlnRqmtIf_Chk01_CndR(){
			return mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR.create();
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
		 * @see mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR
		 */
		public mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>rqmt_pln_imp_typ</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR
		 */
		public mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBAL_PlnRqmtIfService)MGBAL_PlnRqmtIfService_MC_A.this).info;
		}


	}
	/**
	 * PlnRqmtIf_Upd01オペレーション.<p>
	 *
	 * ＳＣＭから月次計画を取り込む。<br>
	 */
	abstract public class PlnRqmtIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PlnRqmtIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR up0;
		
		
		// コンストラクタ
		protected PlnRqmtIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR.create();

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
			invoke((MGBAL_PlnRqmtIfService)MGBAL_PlnRqmtIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PlnRqmtIf_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR createPlnRqmtIf_Upd01_CndR(){
			return mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR.create();
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
		 * @see mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR
		 */
		public mcframe.serverMGBA.MGBAL5020.PlnRqmtIf_Chk01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBAL_PlnRqmtIfService)MGBAL_PlnRqmtIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}