package mcframe.serverMABC.MABCB0010;

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
 * "MABCB_SendIfBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCB_SendIfBatch_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABCB0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCB_SendIfBatch.SendIf_Ins01 aSendIf_Ins01;

	protected void initSendIf_Ins01() {
		this.info = PDef.MA_MABCB0010_SendIf_Ins01_INFO;
		this.aSendIf_Ins01 = ((MABCB_SendIfBatch)this).new SendIf_Ins01();
	}

	public static MABCB_SendIfBatch.SendIf_Ins01 crtSendIf_Ins01() {
		MABCB_SendIfBatch lgc = new MABCB_SendIfBatch();
		lgc.initSendIf_Ins01();
		return lgc.aSendIf_Ins01;
	}

	protected void paramSendIf_Ins01(MCParam p) {
		if (this.aSendIf_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSendIf_Ins01.up0());
	}

	protected void doSendIf_Ins01() {
		aSendIf_Ins01.call();
	};

	/**
	 * SendIf_Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCB0010.SendIf_Ins01_CndR createSendIf_Ins01_CndR(){
		return mcframe.serverMABC.MABCB0010.SendIf_Ins01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SendIf_Ins01オペレーション.<p>
	 *
	 * 送受信ＩＦテーブルに対象マスタの送信レコードを登録する。<br>
	 */
	abstract public class SendIf_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SendIf_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCB0010.SendIf_Ins01_CndR up0;
		
		
		// コンストラクタ
		protected SendIf_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCB0010.SendIf_Ins01_CndR.create();

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
			invoke((MABCB_SendIfBatch)MABCB_SendIfBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SendIf_Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCB0010.SendIf_Ins01_CndR createSendIf_Ins01_CndR(){
			return mcframe.serverMABC.MABCB0010.SendIf_Ins01_CndR.create();
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
		 * 	<tr><td><br></td><td>cfp_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCB0010.SendIf_Ins01_CndR
		 */
		public mcframe.serverMABC.MABCB0010.SendIf_Ins01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCB_SendIfBatch)MABCB_SendIfBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}