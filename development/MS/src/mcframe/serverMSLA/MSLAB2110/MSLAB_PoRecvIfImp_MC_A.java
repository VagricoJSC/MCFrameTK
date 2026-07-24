package mcframe.serverMSLA.MSLAB2110;

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
 * "MSLAB_PoRecvIfImp"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAB_PoRecvIfImp_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSLAB2110";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAB_PoRecvIfImp.PoRecvIfImp_Upd01 aPoRecvIfImp_Upd01;

	protected void initPoRecvIfImp_Upd01() {
		this.info = PDef.MS_MSLAB2110_PoRecvIfImp_Upd01_INFO;
		this.aPoRecvIfImp_Upd01 = ((MSLAB_PoRecvIfImp)this).new PoRecvIfImp_Upd01();
	}

	public static MSLAB_PoRecvIfImp.PoRecvIfImp_Upd01 crtPoRecvIfImp_Upd01() {
		MSLAB_PoRecvIfImp lgc = new MSLAB_PoRecvIfImp();
		lgc.initPoRecvIfImp_Upd01();
		return lgc.aPoRecvIfImp_Upd01;
	}

	protected void paramPoRecvIfImp_Upd01(MCParam p) {
		if (this.aPoRecvIfImp_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPoRecvIfImp_Upd01.up0());
	}

	protected void doPoRecvIfImp_Upd01() {
		aPoRecvIfImp_Upd01.call();
	};

	/**
	 * PoRecvIfImp_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAB2110.PoRecvIfImp_Upd01_CndR createPoRecvIfImp_Upd01_CndR(){
		return mcframe.serverMSLA.MSLAB2110.PoRecvIfImp_Upd01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PoRecvIfImp_Upd01オペレーション.<p>
	 *
	 * 発注受信ＩＦの取込処理を実行する。<br>
	 */
	abstract public class PoRecvIfImp_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PoRecvIfImp_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAB2110.PoRecvIfImp_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected PoRecvIfImp_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAB2110.PoRecvIfImp_Upd01_CndR.create();

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
			invoke((MSLAB_PoRecvIfImp)MSLAB_PoRecvIfImp_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PoRecvIfImp_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAB2110.PoRecvIfImp_Upd01_CndR createPoRecvIfImp_Upd01_CndR(){
			return mcframe.serverMSLA.MSLAB2110.PoRecvIfImp_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
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
		 * @see mcframe.serverMSLA.MSLAB2110.PoRecvIfImp_Upd01_CndR
		 */
		public mcframe.serverMSLA.MSLAB2110.PoRecvIfImp_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAB_PoRecvIfImp)MSLAB_PoRecvIfImp_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}