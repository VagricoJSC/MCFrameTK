package mcframe.serverMSLA.MSLAB2440;

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
 * "MSLAB_SendSchdOrdLnk"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAB_SendSchdOrdLnk_MC_A extends mcframe.serverMSLA.MSLAB5010.MSLAB_SchedulerSendBatchBase {
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
	public static final String LOGIC_ID = "MSLAB2440";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAB_SendSchdOrdLnk.SendSchdOrdLnk_Upd01 aSendSchdOrdLnk_Upd01;

	protected void initSendSchdOrdLnk_Upd01() {
		this.info = PDef.MS_MSLAB2440_SendSchdOrdLnk_Upd01_INFO;
		this.aSendSchdOrdLnk_Upd01 = ((MSLAB_SendSchdOrdLnk)this).new SendSchdOrdLnk_Upd01();
	}

	public static MSLAB_SendSchdOrdLnk.SendSchdOrdLnk_Upd01 crtSendSchdOrdLnk_Upd01() {
		MSLAB_SendSchdOrdLnk lgc = new MSLAB_SendSchdOrdLnk();
		lgc.initSendSchdOrdLnk_Upd01();
		return lgc.aSendSchdOrdLnk_Upd01;
	}

	protected void paramSendSchdOrdLnk_Upd01(MCParam p) {
		if (this.aSendSchdOrdLnk_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendSchdOrdLnk_Upd01.up0());
	}

	protected void doSendSchdOrdLnk_Upd01() {
		aSendSchdOrdLnk_Upd01.call();
	};

	/**
	 * SendSchdOrdLnk_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAB2440.SendSchdOrdLnk_Upd01_CndR createSendSchdOrdLnk_Upd01_CndR(){
		return mcframe.serverMSLA.MSLAB2440.SendSchdOrdLnk_Upd01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SendSchdOrdLnk_Upd01オペレーション.<p>
	 *
	 * スケジューラ連携用のオーダ引当情報をＩＦテーブルに登録する。<br>
	 */
	abstract public class SendSchdOrdLnk_Upd01 extends mcframe.serverMSLA.MSLAB5010.MSLAB_SchedulerSendBatchBase.SchedulerSendBatchBase_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendSchdOrdLnk_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAB2440.SendSchdOrdLnk_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected SendSchdOrdLnk_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAB2440.SendSchdOrdLnk_Upd01_CndR.create();

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
			invoke((MSLAB_SendSchdOrdLnk)MSLAB_SendSchdOrdLnk_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SendSchdOrdLnk_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAB2440.SendSchdOrdLnk_Upd01_CndR createSendSchdOrdLnk_Upd01_CndR(){
			return mcframe.serverMSLA.MSLAB2440.SendSchdOrdLnk_Upd01_CndR.create();
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
		 * 	<tr><td><br></td><td>mfg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>term_from</td></tr>
		 * 	<tr><td><br></td><td>term_to</td></tr>
		 * 	<tr><td><br></td><td>if_scheduler_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAB2440.SendSchdOrdLnk_Upd01_CndR
		 */
		public mcframe.serverMSLA.MSLAB2440.SendSchdOrdLnk_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAB_SendSchdOrdLnk)MSLAB_SendSchdOrdLnk_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}