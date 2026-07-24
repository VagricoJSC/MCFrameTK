package mcframe.serverMSLA.MSLAL5210;

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
 * "MSLAL_BillSendIfService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSLAL_BillSendIfService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSLAL5210";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSLAL_BillSendIfService.BillSendIf_Upd01 aBillSendIf_Upd01;

	protected void initBillSendIf_Upd01() {
		this.info = PDef.MS_MSLAL5210_BillSendIf_Upd01_INFO;
		this.aBillSendIf_Upd01 = ((MSLAL_BillSendIfService)this).new BillSendIf_Upd01();
	}

	public static MSLAL_BillSendIfService.BillSendIf_Upd01 crtBillSendIf_Upd01() {
		MSLAL_BillSendIfService lgc = new MSLAL_BillSendIfService();
		lgc.initBillSendIf_Upd01();
		return lgc.aBillSendIf_Upd01;
	}

	protected void paramBillSendIf_Upd01(MCParam p) {
		if (this.aBillSendIf_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBillSendIf_Upd01.up0());
	}

	protected void doBillSendIf_Upd01() {
		aBillSendIf_Upd01.call();
	};

	/**
	 * Bill_Send01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrR createBill_Send01_HdrR(){
		return mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrR.create();
	}

	/**
	 * Bill_Send01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrR> createBill_Send01_HdrL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrR.class);
	}

	/**
	 * Bill_Send01_HdrDtlBaseブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrDtlBaseR createBill_Send01_HdrDtlBaseR(){
		return mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrDtlBaseR.create();
	}

	/**
	 * Bill_Send01_HdrDtlBaseブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrDtlBaseR> createBill_Send01_HdrDtlBaseL(){
		return MCList.create(mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrDtlBaseR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * BillSendIf_Upd01オペレーション.<p>
	 *
	 * 送信対象の請求書をＩＦテーブルに書き込む<br>
	 */
	abstract public class BillSendIf_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BillSendIf_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrR> up0;
		/** [Bill_Send01_HdrDtlBase]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrDtlBaseR> aBill_Send01_HdrDtlBase;
		
		
		// コンストラクタ
		protected BillSendIf_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrR.class);
			aBill_Send01_HdrDtlBase = MCList.create(mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrDtlBaseR.class);

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
			invoke((MSLAL_BillSendIfService)MSLAL_BillSendIfService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Bill_Send01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrR createBill_Send01_HdrR(){
			return mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrR.create();
		}

		/**
		 * Bill_Send01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrR> createBill_Send01_HdrL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrR.class);
		}

		/**
		 * Bill_Send01_HdrDtlBaseブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrDtlBaseR createBill_Send01_HdrDtlBaseR(){
			return mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrDtlBaseR.create();
		}

		/**
		 * Bill_Send01_HdrDtlBaseブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrDtlBaseR> createBill_Send01_HdrDtlBaseL(){
			return MCList.create(mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrDtlBaseR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_mng_no</td></tr>
		 * 	<tr><td><br></td><td>bill_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>bill_print_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_close_cancel_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrR> up0() {
			return up0;
		}



		/**
		 * [Bill_Send01_HdrDtlBase]ブロックのコンテナaBill_Send01_HdrDtlBaseLを返します。
		 *
		 * @return Bill_Send01_HdrDtlBaseL
		 */
		public MCList<mcframe.serverMSLA.MSLAL5210.Bill_Send01_HdrDtlBaseR> Bill_Send01_HdrDtlBase() {
			return aBill_Send01_HdrDtlBase;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSLAL_BillSendIfService)MSLAL_BillSendIfService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}