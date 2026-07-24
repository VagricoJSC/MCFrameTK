package mcframe.serverPFBB.PFBBL5220;

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
 * "PFBBL_AcDptIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class PFBBL_AcDptIf_MC_A extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase {
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
	public static final String LOGIC_ID = "PFBBL5220";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected PFBBL_AcDptIf.AcDptIf_Conv01 aAcDptIf_Conv01;

	protected void initAcDptIf_Conv01() {
		this.info = PDef.PF_PFBBL5220_AcDptIf_Conv01_INFO;
		this.aAcDptIf_Conv01 = ((PFBBL_AcDptIf)this).new AcDptIf_Conv01();
	}

	public static PFBBL_AcDptIf.AcDptIf_Conv01 crtAcDptIf_Conv01() {
		PFBBL_AcDptIf lgc = new PFBBL_AcDptIf();
		lgc.initAcDptIf_Conv01();
		return lgc.aAcDptIf_Conv01;
	}

	protected void paramAcDptIf_Conv01(MCParam p) {
		if (this.aAcDptIf_Conv01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAcDptIf_Conv01.up0());
		p.addUpBlock(aAcDptIf_Conv01.up1());
		p.addDownBlock(aAcDptIf_Conv01.down0());
	}

	protected void doAcDptIf_Conv01() {
		aAcDptIf_Conv01.call();
	};

	/**
	 * DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.commonPFBB.PFBBR5220.DtlR createDtlR(){
		return mcframe.commonPFBB.PFBBR5220.DtlR.create();
	}

	/**
	 * DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.commonPFBB.PFBBR5220.DtlR> createDtlL(){
		return MCList.create(mcframe.commonPFBB.PFBBR5220.DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * AcDptIf_Conv01オペレーション.<p>
	 *
	 */
	abstract public class AcDptIf_Conv01 extends mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase06 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AcDptIf_Conv01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		// up0 は自動生成されません。
		//     up0 は、superOperationのフィールドを使用します。
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.commonPFBB.PFBBR5220.DtlR> up1;
		// down0 は自動生成されません。
		//     down0 は、superOperationのフィールドを使用します。
		
		
		// コンストラクタ
		protected AcDptIf_Conv01() {
			
			// このオペレーションのコンテナ初期化
			// up0 の初期化は、superOperationのコンストラクタで行います。
			up1 = MCList.create(mcframe.commonPFBB.PFBBR5220.DtlR.class);
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
			invoke((PFBBL_AcDptIf)PFBBL_AcDptIf_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.commonPFBB.PFBBR5220.DtlR createDtlR(){
			return mcframe.commonPFBB.PFBBR5220.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.commonPFBB.PFBBR5220.DtlR> createDtlL(){
			return MCList.create(mcframe.commonPFBB.PFBBR5220.DtlR.class);
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
		 * 	<tr><td><br></td><td>departmenttype</td></tr>
		 * 	<tr><td><br></td><td>code</td></tr>
		 * 	<tr><td><br></td><td>name</td></tr>
		 * 	<tr><td><br></td><td>activeflag</td></tr>
		 * 	<tr><td><br></td><td>extension</td></tr>
		 * 	<tr><td><br></td><td>searchcharacter</td></tr>
		 * 	<tr><td><br></td><td>zip</td></tr>
		 * 	<tr><td><br></td><td>address1</td></tr>
		 * 	<tr><td><br></td><td>address2</td></tr>
		 * 	<tr><td><br></td><td>tel1</td></tr>
		 * 	<tr><td><br></td><td>tel2</td></tr>
		 * 	<tr><td><br></td><td>fax</td></tr>
		 * 	<tr><td><br></td><td>paymentwarehouse</td></tr>
		 * 	<tr><td><br></td><td>location</td></tr>
		 * 	<tr><td><br></td><td>bookno_numbering_flag</td></tr>
		 * 	<tr><td><br></td><td>mfgflg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.commonPFBB.PFBBR5220.DtlR> up1() {
			return up1;
		}


		//
		// down0() は自動生成されません。
		//     down0 のアクセサはsuperOperationのメソッドを使用します。
		//


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((PFBBL_AcDptIf)PFBBL_AcDptIf_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}