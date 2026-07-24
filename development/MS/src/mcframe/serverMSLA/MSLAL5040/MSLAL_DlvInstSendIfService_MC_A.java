package mcframe.serverMSLA.MSLAL5040;

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
 * "MSLAL_DlvInstSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_DlvInstSendIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSLAL5040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_DlvInstSendIfService.DlvInstSendIf_Upd01 aDlvInstSendIf_Upd01;

	protected void initDlvInstSendIf_Upd01() {
		this.info = PDef.MS_MSLAL5040_DlvInstSendIf_Upd01_INFO;
		this.aDlvInstSendIf_Upd01 = ((MSLAL_DlvInstSendIfService)this).new DlvInstSendIf_Upd01();
	}

	public static MSLAL_DlvInstSendIfService.DlvInstSendIf_Upd01 crtDlvInstSendIf_Upd01() {
		MSLAL_DlvInstSendIfService lgc = new MSLAL_DlvInstSendIfService();
		lgc.initDlvInstSendIf_Upd01();
		return lgc.aDlvInstSendIf_Upd01;
	}

	protected void paramDlvInstSendIf_Upd01(MCParam p) {
		if (this.aDlvInstSendIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDlvInstSendIf_Upd01.up0());
	}

	protected void doDlvInstSendIf_Upd01() {
		aDlvInstSendIf_Upd01.call();
	};

	/**
	 * DlvInstSendIf_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5040.DlvInstSendIf_Upd01_DtlR createDlvInstSendIf_Upd01_DtlR(){
		return mcframe.serverMSLA.MSLAL5040.DlvInstSendIf_Upd01_DtlR.create();
	}

	/**
	 * DlvInstSendIf_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5040.DlvInstSendIf_Upd01_DtlR> createDlvInstSendIf_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5040.DlvInstSendIf_Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * DlvInstSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の納入指示情報をＩＦテーブルに書き込む<br>
	 */
	abstract public class DlvInstSendIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DlvInstSendIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5040.DlvInstSendIf_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected DlvInstSendIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5040.DlvInstSendIf_Upd01_DtlR.class);

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
			invoke((MSLAL_DlvInstSendIfService)MSLAL_DlvInstSendIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * DlvInstSendIf_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5040.DlvInstSendIf_Upd01_DtlR createDlvInstSendIf_Upd01_DtlR(){
			return mcframe.serverMSLA.MSLAL5040.DlvInstSendIf_Upd01_DtlR.create();
		}

		/**
		 * DlvInstSendIf_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5040.DlvInstSendIf_Upd01_DtlR> createDlvInstSendIf_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5040.DlvInstSendIf_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5040.DlvInstSendIf_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_DlvInstSendIfService)MSLAL_DlvInstSendIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}