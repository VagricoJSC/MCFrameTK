package mcframe.serverMSLC.MSLCB0010;

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
 * "MSLCB_ScmDataSendIfBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLCB_ScmDataSendIfBatch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSLC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSLCB0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLCB_ScmDataSendIfBatch.SendIf_Upd01 aSendIf_Upd01;

	protected void initSendIf_Upd01() {
		this.info = PDef.MS_MSLCB0010_SendIf_Upd01_INFO;
		this.aSendIf_Upd01 = ((MSLCB_ScmDataSendIfBatch)this).new SendIf_Upd01();
	}

	public static MSLCB_ScmDataSendIfBatch.SendIf_Upd01 crtSendIf_Upd01() {
		MSLCB_ScmDataSendIfBatch lgc = new MSLCB_ScmDataSendIfBatch();
		lgc.initSendIf_Upd01();
		return lgc.aSendIf_Upd01;
	}

	protected void paramSendIf_Upd01(MCParam p) {
		if (this.aSendIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendIf_Upd01.up0());
	}

	protected void doSendIf_Upd01() {
		aSendIf_Upd01.call();
	};

	/**
	 * SendIf_Upd01_Dtl_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLC.MSLCB0010.SendIf_Upd01_Dtl_CndR createSendIf_Upd01_Dtl_CndR(){
		return mcframe.serverMSLC.MSLCB0010.SendIf_Upd01_Dtl_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SendIf_Upd01オペレーション.<p>
	 *
	 * BI LinkのＩＦテーブルへデータ登録を行う処理を実行する。<br>
	 */
	abstract public class SendIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSLC.MSLCB0010.SendIf_Upd01_Dtl_CndR up0;
		
		
		// コンストラクタ
		protected SendIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSLC.MSLCB0010.SendIf_Upd01_Dtl_CndR.create();

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
			invoke((MSLCB_ScmDataSendIfBatch)MSLCB_ScmDataSendIfBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SendIf_Upd01_Dtl_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLC.MSLCB0010.SendIf_Upd01_Dtl_CndR createSendIf_Upd01_Dtl_CndR(){
			return mcframe.serverMSLC.MSLCB0010.SendIf_Upd01_Dtl_CndR.create();
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
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>non_mov_cmp_dt</td></tr>
		 * 	<tr><td><br></td><td>non_mov_base_days</td></tr>
		 * 	<tr><td><br></td><td>co_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSLC.MSLCB0010.SendIf_Upd01_Dtl_CndR
		 */
		public mcframe.serverMSLC.MSLCB0010.SendIf_Upd01_Dtl_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLCB_ScmDataSendIfBatch)MSLCB_ScmDataSendIfBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}