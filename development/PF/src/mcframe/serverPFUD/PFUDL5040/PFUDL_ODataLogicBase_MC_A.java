package mcframe.serverPFUD.PFUDL5040;

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
 * "PFUDL_ODataLogicBase"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFUDL_ODataLogicBase_MC_A extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "PF";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "PFUD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "PFUDL5040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected PFUDL_ODataLogicBase.SrchBase01 aSrchBase01;

	protected void initSrchBase01() {
		this.info = PDef.PF_PFUDL5040_SrchBase01_INFO;
		this.aSrchBase01 = ((PFUDL_ODataLogicBase)this).new SrchBase01();
	}

	public static PFUDL_ODataLogicBase.SrchBase01 crtSrchBase01() {
		PFUDL_ODataLogicBase lgc = new PFUDL_ODataLogicBase();
		lgc.initSrchBase01();
		return lgc.aSrchBase01;
	}

	protected void paramSrchBase01(MCParam p) {
		if (this.aSrchBase01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrchBase01.up0());
	}

	protected void doSrchBase01() {
		aSrchBase01.call();
	};

	/**
	 * SrchBase01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverPFUD.PFUDL5040.SrchBase01_CndR createSrchBase01_CndR(){
		return mcframe.serverPFUD.PFUDL5040.SrchBase01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SrchBase01オペレーション.<p>
	 *
	 */
	abstract public class SrchBase01 extends mcframe.serverPFUD.PFUDL5000.PFUDL_LogicBase.OperationBase {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SrchBase01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverPFUD.PFUDL5040.SrchBase01_CndR up0;
		
		
		// コンストラクタ
		protected SrchBase01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverPFUD.PFUDL5040.SrchBase01_CndR.create();

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
			invoke((PFUDL_ODataLogicBase)PFUDL_ODataLogicBase_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SrchBase01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverPFUD.PFUDL5040.SrchBase01_CndR createSrchBase01_CndR(){
			return mcframe.serverPFUD.PFUDL5040.SrchBase01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverPFUD.PFUDL5040.SrchBase01_CndR
		 */
		public mcframe.serverPFUD.PFUDL5040.SrchBase01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFUDL_ODataLogicBase)PFUDL_ODataLogicBase_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}