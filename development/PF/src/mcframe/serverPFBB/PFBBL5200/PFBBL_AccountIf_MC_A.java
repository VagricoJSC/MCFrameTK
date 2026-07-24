package mcframe.serverPFBB.PFBBL5200;

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
 * "PFBBL_AccountIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFBBL_AccountIf_MC_A extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase {
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
	public static final String SUBMODULE_ID = "PFBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "PFBBL5200";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected PFBBL_AccountIf.AccountIf_Conv01 aAccountIf_Conv01;

	protected void initAccountIf_Conv01() {
		this.info = PDef.PF_PFBBL5200_AccountIf_Conv01_INFO;
		this.aAccountIf_Conv01 = ((PFBBL_AccountIf)this).new AccountIf_Conv01();
	}

	public static PFBBL_AccountIf.AccountIf_Conv01 crtAccountIf_Conv01() {
		PFBBL_AccountIf lgc = new PFBBL_AccountIf();
		lgc.initAccountIf_Conv01();
		return lgc.aAccountIf_Conv01;
	}

	protected void paramAccountIf_Conv01(MCParam p) {
		if (this.aAccountIf_Conv01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAccountIf_Conv01.up0());
		p.addUpBlock(aAccountIf_Conv01.up1());
		p.addDownBlock(aAccountIf_Conv01.down0());
	}

	protected void doAccountIf_Conv01() {
		aAccountIf_Conv01.call();
	};

	/**
	 * DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.commonPFBB.PFBBR5200.DtlR createDtlR(){
		return mcframe.commonPFBB.PFBBR5200.DtlR.create();
	}

	/**
	 * DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.commonPFBB.PFBBR5200.DtlR> createDtlL(){
		return MCList.create(mcframe.commonPFBB.PFBBR5200.DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * AccountIf_Conv01オペレーション.<p>
	 *
	 */
	abstract public class AccountIf_Conv01 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase06 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AccountIf_Conv01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.commonPFBB.PFBBR5200.DtlR> up1;
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected AccountIf_Conv01() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			up1 = MCList.create(mcframe.commonPFBB.PFBBR5200.DtlR.class);
			// down0 の初期化は、superOperationのコンストラクタで行います。

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((PFBBL_AccountIf)PFBBL_AccountIf_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.commonPFBB.PFBBR5200.DtlR createDtlR(){
			return mcframe.commonPFBB.PFBBR5200.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.commonPFBB.PFBBR5200.DtlR> createDtlL(){
			return MCList.create(mcframe.commonPFBB.PFBBR5200.DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		//
		// up0() は自動生成されません。
		//     up0 のアクセサはsuperOperationのメソッドを使用します。
		//
		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rectype</td></tr>
		 * 	<tr><td><br></td><td>precode</td></tr>
		 * 	<tr><td><br></td><td>name</td></tr>
		 * 	<tr><td><br></td><td>activeflag</td></tr>
		 * 	<tr><td><br></td><td>extension</td></tr>
		 * 	<tr><td><br></td><td>searchcharacter</td></tr>
		 * 	<tr><td><br></td><td>accounttype</td></tr>
		 * 	<tr><td><br></td><td>sp_accounttype</td></tr>
		 * 	<tr><td><br></td><td>currencycode</td></tr>
		 * 	<tr><td><br></td><td>ratetypecode</td></tr>
		 * 	<tr><td><br></td><td>reval_ratetypecode</td></tr>
		 * 	<tr><td><br></td><td>cnsr_ratetype1</td></tr>
		 * 	<tr><td><br></td><td>cnsr_ratetype2</td></tr>
		 * 	<tr><td><br></td><td>subincludeflag</td></tr>
		 * 	<tr><td><br></td><td>appraisalconvflag</td></tr>
		 * 	<tr><td><br></td><td>vat_flag</td></tr>
		 * 	<tr><td><br></td><td>reversingflag</td></tr>
		 * 	<tr><td><br></td><td>aparappraisalflag</td></tr>
		 * 	<tr><td><br></td><td>aparreversingflag</td></tr>
		 * 	<tr><td><br></td><td>tax_ac_flag</td></tr>
		 * 	<tr><td><br></td><td>taxablecode</td></tr>
		 * 	<tr><td><br></td><td>taxabletype</td></tr>
		 * 	<tr><td><br></td><td>openup_ar</td></tr>
		 * 	<tr><td><br></td><td>openup_ap</td></tr>
		 * 	<tr><td><br></td><td>openup_acc</td></tr>
		 * 	<tr><td><br></td><td>correspondentset</td></tr>
		 * 	<tr><td><br></td><td>descriptcontrol</td></tr>
		 * 	<tr><td><br></td><td>usermaster1control</td></tr>
		 * 	<tr><td><br></td><td>usermaster2control</td></tr>
		 * 	<tr><td><br></td><td>usermaster3control</td></tr>
		 * 	<tr><td><br></td><td>usermaster4control</td></tr>
		 * 	<tr><td><br></td><td>usermaster5control</td></tr>
		 * 	<tr><td><br></td><td>usercodecontrol</td></tr>
		 * 	<tr><td><br></td><td>usertextcontrol</td></tr>
		 * 	<tr><td><br></td><td>userdatecontrol</td></tr>
		 * 	<tr><td><br></td><td>userqtycontrol</td></tr>
		 * 	<tr><td><br></td><td>correspondentsummary</td></tr>
		 * 	<tr><td><br></td><td>usermaster1summary</td></tr>
		 * 	<tr><td><br></td><td>usermaster2summary</td></tr>
		 * 	<tr><td><br></td><td>usermaster3summary</td></tr>
		 * 	<tr><td><br></td><td>usermaster4summary</td></tr>
		 * 	<tr><td><br></td><td>usermaster5summary</td></tr>
		 * 	<tr><td><br></td><td>userdatesummary</td></tr>
		 * 	<tr><td><br></td><td>userqtysummary</td></tr>
		 * 	<tr><td><br></td><td>pc_ratetype1</td></tr>
		 * 	<tr><td><br></td><td>pc_exchangetype1</td></tr>
		 * 	<tr><td><br></td><td>pc_ratetype2</td></tr>
		 * 	<tr><td><br></td><td>pc_exchangetype2</td></tr>
		 * 	<tr><td><br></td><td>pc_ratetype3</td></tr>
		 * 	<tr><td><br></td><td>pc_exchangetype3</td></tr>
		 * 	<tr><td><br></td><td>safetybalancefc</td></tr>
		 * 	<tr><td><br></td><td>fstype</td></tr>
		 * 	<tr><td><br></td><td>beginend</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.commonPFBB.PFBBR5200.DtlR> up1() {
			return up1;
		}


		//
		// down0() は自動生成されません。
		//     down0 のアクセサはsuperOperationのメソッドを使用します。
		//


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBBL_AccountIf)PFBBL_AccountIf_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}