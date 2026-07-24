package mcframe.serverMSLA.MSLAB2430;

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
 * "MSLAB_SendSchdItmDtlBomMst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAB_SendSchdItmDtlBomMst_MC_A extends mcframe.serverMSLA.MSLAB5010.MSLAB_SchedulerSendBatchBase {
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
	public static final String LOGIC_ID = "MSLAB2430";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAB_SendSchdItmDtlBomMst.SendSchdItmDtlBomMst_Upd01 aSendSchdItmDtlBomMst_Upd01;

	protected void initSendSchdItmDtlBomMst_Upd01() {
		this.info = PDef.MS_MSLAB2430_SendSchdItmDtlBomMst_Upd01_INFO;
		this.aSendSchdItmDtlBomMst_Upd01 = ((MSLAB_SendSchdItmDtlBomMst)this).new SendSchdItmDtlBomMst_Upd01();
	}

	public static MSLAB_SendSchdItmDtlBomMst.SendSchdItmDtlBomMst_Upd01 crtSendSchdItmDtlBomMst_Upd01() {
		MSLAB_SendSchdItmDtlBomMst lgc = new MSLAB_SendSchdItmDtlBomMst();
		lgc.initSendSchdItmDtlBomMst_Upd01();
		return lgc.aSendSchdItmDtlBomMst_Upd01;
	}

	protected void paramSendSchdItmDtlBomMst_Upd01(MCParam p) {
		if (this.aSendSchdItmDtlBomMst_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendSchdItmDtlBomMst_Upd01.up0());
	}

	protected void doSendSchdItmDtlBomMst_Upd01() {
		aSendSchdItmDtlBomMst_Upd01.call();
	};

	/**
	 * SendSchdItmDtlBomMst_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAB2430.SendSchdItmDtlBomMst_Upd01_CndR createSendSchdItmDtlBomMst_Upd01_CndR(){
		return mcframe.serverMSLA.MSLAB2430.SendSchdItmDtlBomMst_Upd01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SendSchdItmDtlBomMst_Upd01オペレーション.<p>
	 *
	 * スケジューラ連携用の品目詳細マスタとBOMの展開結果を結合しＩＦテーブルに登録する。<br>
	 */
	abstract public class SendSchdItmDtlBomMst_Upd01 extends mcframe.serverMSLA.MSLAB5010.MSLAB_SchedulerSendBatchBase.SchedulerSendBatchBase_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendSchdItmDtlBomMst_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLA.MSLAB2430.SendSchdItmDtlBomMst_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected SendSchdItmDtlBomMst_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLA.MSLAB2430.SendSchdItmDtlBomMst_Upd01_CndR.create();

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
			invoke((MSLAB_SendSchdItmDtlBomMst)MSLAB_SendSchdItmDtlBomMst_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SendSchdItmDtlBomMst_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAB2430.SendSchdItmDtlBomMst_Upd01_CndR createSendSchdItmDtlBomMst_Upd01_CndR(){
			return mcframe.serverMSLA.MSLAB2430.SendSchdItmDtlBomMst_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>if_scheduler_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLA.MSLAB2430.SendSchdItmDtlBomMst_Upd01_CndR
		 */
		public mcframe.serverMSLA.MSLAB2430.SendSchdItmDtlBomMst_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAB_SendSchdItmDtlBomMst)MSLAB_SendSchdItmDtlBomMst_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}