package mcframe.serverMGUC.MGUCL0020;

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
 * "MGUCL_AppSys"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGUCL_AppSys_MC_A extends mcframe.serverCore.logic.MCLogicBase {
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
	public static final String SUBMODULE_ID = "MGUC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGUCL0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGUCL_AppSys.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGUCL0020_Srch01_INFO;
		this.aSrch01 = ((MGUCL_AppSys)this).new Srch01();
	}

	public static MGUCL_AppSys.Srch01 crtSrch01() {
		MGUCL_AppSys lgc = new MGUCL_AppSys();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addDownBlock(aSrch01.down0());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * ExpnsブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGUC.MGUCL0020.ExpnsR createExpnsR(){
		return mcframe.serverMGUC.MGUCL0020.ExpnsR.create();
	}

	/**
	 * ExpnsブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGUC.MGUCL0020.ExpnsR> createExpnsL(){
		return MCList.create(mcframe.serverMGUC.MGUCL0020.ExpnsR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 費目情報を取得します。<br>
	 */
	abstract public class Srch01 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGUC.MGUCL0020.ExpnsR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			down0 = MCList.create(mcframe.serverMGUC.MGUCL0020.ExpnsR.class);

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
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MGUCL_AppSys)MGUCL_AppSys_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ExpnsブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGUC.MGUCL0020.ExpnsR createExpnsR(){
			return mcframe.serverMGUC.MGUCL0020.ExpnsR.create();
		}

		/**
		 * ExpnsブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGUC.MGUCL0020.ExpnsR> createExpnsL(){
			return MCList.create(mcframe.serverMGUC.MGUCL0020.ExpnsR.class);
		}

		//-------------------------外部 I/F--------------------------

		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>exp.expns_cd</td></tr>
		 * 	<tr><td><br></td><td>exp.expns_nm</td></tr>
		 * 	<tr><td><br></td><td>exp.expns_typ</td></tr>
		 * 	<tr><td><br></td><td>exp.expns_seq</td></tr>
		 * 	<tr><td><br></td><td>exp.direct_typ</td></tr>
		 * 	<tr><td><br></td><td>exp.var_typ</td></tr>
		 * 	<tr><td><br></td><td>exp.expns_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>expns_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>expns_grp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGUC.MGUCL0020.ExpnsR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGUCL_AppSys)MGUCL_AppSys_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}