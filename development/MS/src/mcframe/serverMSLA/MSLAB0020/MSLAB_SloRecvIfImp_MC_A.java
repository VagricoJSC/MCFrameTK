package mcframe.serverMSLA.MSLAB0020;

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
 * "MSLAB_SloRecvIfImp"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAB_SloRecvIfImp_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSLA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSLAB0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAB_SloRecvIfImp.SloRecvIfImp_Upd01 aSloRecvIfImp_Upd01;

	protected void initSloRecvIfImp_Upd01() {
		this.info = PDef.MS_MSLAB0020_SloRecvIfImp_Upd01_INFO;
		this.aSloRecvIfImp_Upd01 = ((MSLAB_SloRecvIfImp)this).new SloRecvIfImp_Upd01();
	}

	public static MSLAB_SloRecvIfImp.SloRecvIfImp_Upd01 crtSloRecvIfImp_Upd01() {
		MSLAB_SloRecvIfImp lgc = new MSLAB_SloRecvIfImp();
		lgc.initSloRecvIfImp_Upd01();
		return lgc.aSloRecvIfImp_Upd01;
	}

	protected void paramSloRecvIfImp_Upd01(MCParam p) {
		if (this.aSloRecvIfImp_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSloRecvIfImp_Upd01.up0());
	}

	protected void doSloRecvIfImp_Upd01() {
		aSloRecvIfImp_Upd01.call();
	};

	/**
	 * SloRecvIfImp_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAB0020.SloRecvIfImp_Upd01_CndR createSloRecvIfImp_Upd01_CndR(){
		return mcframe.serverMSLA.MSLAB0020.SloRecvIfImp_Upd01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SloRecvIfImp_Upd01オペレーション.<p>
	 *
	 * 受注受信ＩＦの取込処理を実行する。<br>
	 */
	abstract public class SloRecvIfImp_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SloRecvIfImp_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAB0020.SloRecvIfImp_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected SloRecvIfImp_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAB0020.SloRecvIfImp_Upd01_CndR.create();

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
			invoke((MSLAB_SloRecvIfImp)MSLAB_SloRecvIfImp_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SloRecvIfImp_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAB0020.SloRecvIfImp_Upd01_CndR createSloRecvIfImp_Upd01_CndR(){
			return mcframe.serverMSLA.MSLAB0020.SloRecvIfImp_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd1</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd2</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd3</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd4</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd5</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd6</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd7</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd8</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd9</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAB0020.SloRecvIfImp_Upd01_CndR
		 */
		public mcframe.serverMSLA.MSLAB0020.SloRecvIfImp_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAB_SloRecvIfImp)MSLAB_SloRecvIfImp_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}