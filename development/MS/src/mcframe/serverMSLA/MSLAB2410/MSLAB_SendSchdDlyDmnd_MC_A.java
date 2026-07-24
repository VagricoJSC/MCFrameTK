package mcframe.serverMSLA.MSLAB2410;

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
 * "MSLAB_SendSchdDlyDmnd"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAB_SendSchdDlyDmnd_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSLAB2410";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAB_SendSchdDlyDmnd.SendSchdDlyDmnd_Upd01 aSendSchdDlyDmnd_Upd01;

	protected void initSendSchdDlyDmnd_Upd01() {
		this.info = PDef.MS_MSLAB2410_SendSchdDlyDmnd_Upd01_INFO;
		this.aSendSchdDlyDmnd_Upd01 = ((MSLAB_SendSchdDlyDmnd)this).new SendSchdDlyDmnd_Upd01();
	}

	public static MSLAB_SendSchdDlyDmnd.SendSchdDlyDmnd_Upd01 crtSendSchdDlyDmnd_Upd01() {
		MSLAB_SendSchdDlyDmnd lgc = new MSLAB_SendSchdDlyDmnd();
		lgc.initSendSchdDlyDmnd_Upd01();
		return lgc.aSendSchdDlyDmnd_Upd01;
	}

	protected void paramSendSchdDlyDmnd_Upd01(MCParam p) {
		if (this.aSendSchdDlyDmnd_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendSchdDlyDmnd_Upd01.up0());
	}

	protected void doSendSchdDlyDmnd_Upd01() {
		aSendSchdDlyDmnd_Upd01.call();
	};

	/**
	 * SendSchdDlyDmnd_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAB2410.SendSchdDlyDmnd_Upd01_CndR createSendSchdDlyDmnd_Upd01_CndR(){
		return mcframe.serverMSLA.MSLAB2410.SendSchdDlyDmnd_Upd01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SendSchdDlyDmnd_Upd01オペレーション.<p>
	 *
	 * スケジューラ連携用の日次需要データをＩＦテーブルに登録する。<br>
	 */
	abstract public class SendSchdDlyDmnd_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendSchdDlyDmnd_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAB2410.SendSchdDlyDmnd_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected SendSchdDlyDmnd_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAB2410.SendSchdDlyDmnd_Upd01_CndR.create();

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
			invoke((MSLAB_SendSchdDlyDmnd)MSLAB_SendSchdDlyDmnd_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SendSchdDlyDmnd_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAB2410.SendSchdDlyDmnd_Upd01_CndR createSendSchdDlyDmnd_Upd01_CndR(){
			return mcframe.serverMSLA.MSLAB2410.SendSchdDlyDmnd_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAB2410.SendSchdDlyDmnd_Upd01_CndR
		 */
		public mcframe.serverMSLA.MSLAB2410.SendSchdDlyDmnd_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAB_SendSchdDlyDmnd)MSLAB_SendSchdDlyDmnd_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}