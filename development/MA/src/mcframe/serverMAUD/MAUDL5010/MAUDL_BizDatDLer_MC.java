package mcframe.serverMAUD.MAUDL5010;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCBooleanUtil;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCStringUtil;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.notice.MCAppException;
import mcframe.commonCore.notice.MCException;
import mcframe.commonCore.report.MCCSVFile;
import mcframe.commonCore.report.MCReportConst;
import mcframe.commonCore.report.container.MCCSVReportSet;
import mcframe.commonCore.report.container.MCReportMeta;
import mcframe.commonCore.resource.MCFormatConst;
import mcframe.commonCore.resource.MCLocaleConst;
import mcframe.serverCore.sys.MCSys;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0010.MAUDC_BizDatDLEnv.*;
import static mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil.*;

public class MAUDL_BizDatDLer_MC {

	/**
	 * ダウンロードファイル出力用クラス
	 */
	public static class BizDatDLer implements IfBizDatDLer {

		/**
		 * 出力ファイルパス
		 */
		protected String _path = null;

		/**
		 * 出力ファイルタイプ
		 */
		protected String _typ = null;

		/**
		 * 日付（Date）型のデフォルトの書式
		 */
		protected String _dtFmt = null;

		/**
		 * 日付（Timestamp）型のデフォルトの書式
		 */
		protected String _tsFmt = null;

		/**
		 * Excel出力におけるフォント
		 */
		protected String _font = null;

		/**
		 * CSV出力における文字セット
		 */
		protected String _charSet = null;

		/**
		 * ダウンローダ
		 */
		protected IfBizDatDLer _dler = null;

		/**
		 * 出力ヘッダラベル
		 */
		protected String[] _hdrLbls = null;

		/**
		 * 出力データカラム
		 */
		protected String[] _datCols = null;

		/**
		 * 出力データカラムと出力フォーマットの対応関係
		 */
		protected Map<String, String> _fmtMap = null;

		/**
		 * 出力ファイル
		 */
		protected List<File> _fileL = null;

		/**
		 * 出力データ行数
		 */
		protected int _datRowCnt = 0;

		/**
		 * コンストラクタです。
		 */
		protected BizDatDLer(String path) {
			_path = path;
			init();
		}

		/**
		 * 初期化処理を行います。
		 */
		protected void init() {
			String typ = FileInfo.getTyp(getPath());
			IfBizDatDLer dler = null;
			if (typ != null) {
				switch (typ) {
					case FileInfo.XLS :
					case FileInfo.XLSX :
						dler = new BizDatDLerForExcel();
						break;
					case FileInfo.CSV :
						dler = new BizDatDLerForCSV();
						break;
				}
			}
			if (dler == null) {
				throw new MCAppException(MAUDL0403, getPath());
			}
			_typ = typ;
			_dler = dler;
			setDtFmt("YMD");
			setTsFmt("YMDHMS");
			setFont("ＭＳ Ｐゴシック");
			setCharSet(MCReportConst.getDefaultCharset());
		}

		@Override
		public void append(MCList<? extends MCRow> list) {
			_dler.append(list);
		}

		@Override
		public void out() {
			_dler.out();
		}

		/**
		 * 出力ファイルパスを取得します。
		 */
		public String getPath() {
			return _path;
		}

		/**
		 * 日付（Date）型のデフォルトの書式を設定します。
		 */
		public void setDtFmt(String fmt) {
			_dtFmt = fmt;
		}

		/**
		 * 日付（Date）型のデフォルトの書式を取得します。
		 */
		public String getDtFmt() {
			return _dtFmt;
		}

		/**
		 * 日付（Timestamp）型のデフォルトの書式を設定します。
		 */
		public void setTsFmt(String fmt) {
			_tsFmt = fmt;
		}

		/**
		 * 日付（Timestamp）型のデフォルトの書式を取得します。
		 */
		public String getTsFmt() {
			return _tsFmt;
		}

		/**
		 * Excel出力におけるフォントを設定します。
		 */
		public void setFont(String font) {
			_font = font;
		}

		/**
		 * Excel出力におけるフォントを取得します。
		 */
		public String getFont() {
			return _font;
		}

		/**
		 * CSV出力における文字セットを設定します。
		 */
		public void setCharSet(String charSet) {
			_charSet = charSet;
		}

		/**
		 * CSV出力における文字セットを取得します。
		 */
		public String getCharSet() {
			return _charSet;
		}

		/**
		 * 出力ヘッダラベルを設定します。
		 */
		public void setHdrLbls(String... lbls) {
			_hdrLbls = lbls;
		}

		/**
		 * 出力ヘッダラベルを取得します。
		 */
		public String[] getHdrLbls() {
			if (_hdrLbls == null) {
				_hdrLbls = new String[0];
			}
			return _hdrLbls;
		}

		/**
		 * 出力データカラムを設定します。
		 */
		public void setDatCols(String... datCols) {
			_datCols = datCols;
		}

		/**
		 * 出力データカラムを取得します。
		 */
		public String[] getDatCols() {
			if (_datCols == null) {
				_datCols = new String[0];
			}
			return _datCols;
		}

		/**
		 * 出力データカラムと出力フォーマットの対応関係を設定します。
		 */
		public void setFmt(String col, String fmt) {
			getFmtMap().put(col, fmt);
		}

		/**
		 * 出力データカラムと出力フォーマットの対応関係を取得します。
		 */
		public Map<String, String> getFmtMap() {
			if (_fmtMap == null) {
				_fmtMap = new HashMap<>();
			}
			return _fmtMap;
		}

		/**
		 * 出力ファイルを取得します。
		 */
		public List<File> getFileL() {
			if (_fileL == null) {
				_fileL = new ArrayList<>();
			}
			return _fileL;
		}

		/**
		 * 出力データ行数を取得します。
		 */
		public int getDatRowCnt() {
			return _datRowCnt;
		}

		/**
		 * 出力情報を設定します。
		 */
		protected void setOutInfo(MCList<? extends MCRow> rsltL) {
			if (isNull(rsltL)) {
				return;
			}
			String[] arr = rsltL.get(0).getColumnPathArray();
			if (getHdrLbls().length == 0) {
				setHdrLbls(arr);
			}
			if (getDatCols().length == 0) {
				setDatCols(arr);
			}
		}

		//************************************************************

		/**
		 * Excel出力用クラス
		 */
		public class BizDatDLerForExcel implements IfBizDatDLer {

			/**
			 * 編集中のブック
			 */
			protected Workbook _wb = null;

			/**
			 * 編集中のシート
			 */
			protected Sheet _sh = null;

			/**
			 * 出力行番号
			 */
			protected int _rowNum = 0;

			/**
			 * 日付（Date）型の書式
			 */
			protected Map<String, Integer> _dtCellStyleMap = new HashMap<>();

			/**
			 * 日付（Timestamp）型の書式
			 */
			protected Map<String, Integer> _tsCellStyleMap = new HashMap<>();

			/**
			 * 数値型の書式
			 */
			protected Map<Integer, Integer> _numCellStyleMap = new HashMap<>();

			/**
			 * 出力内容を追加します。
			 */
			@Override
			public void append(MCList<? extends MCRow> rsltL) {
				if (isNull(rsltL)) {
					return;
				}
				setOutInfo(rsltL);
				if (!canAppend(rsltL)) {
					return;
				}
				for (int i = 0; i < rsltL.size(); i++) {
					MCRow r = rsltL.get(i);
					if (_rowNum % getMaxRowSize() == 0) {
						if (_rowNum > 0) {
							out();
							_rowNum = 0;
						}
						crtWorkbook();
						crtSheet();
						_dtCellStyleMap.clear();
						_tsCellStyleMap.clear();
						_numCellStyleMap.clear();
						wrtHdr(getHdrLbls());
					}
					Row row = _sh.createRow(_rowNum);
					for (int cellNum = 0; cellNum < getDatCols().length; cellNum++) {
						// リソースのメンテナンスが追いついていない場合でもファイルダウンロードできるようgetValueNEを使う（リソースはリリース前に必ず再自動生成する想定）
						Comparable<?> c = r.getValueNE(getDatCols()[cellNum]);
						wrtDat(row, cellNum, c);
					}
					_rowNum++;
				}
				_datRowCnt += rsltL.size();
			}

			/**
			 * ファイルタイプに対応する最大行数を取得します。
			 */
			protected int getMaxRowSize() {
				switch (_typ) {
					case FileInfo.XLS : 
						return FileInfo.MAX_ROW_XLS;
					case FileInfo.XLSX :
						return FileInfo.MAX_ROW_XLSX;
					default :
						return -1;
				}
			}

			/**
			 * ファイルタイプに対応する最大列数を取得します。
			 */
			protected int getMaxColSize() {
				switch (_typ) {
					case FileInfo.XLS : 
						return FileInfo.MAX_COL_XLS;
					case FileInfo.XLSX :
						return FileInfo.MAX_COL_XLSX;
					default :
						return -1;
				}
			}

			/**
			 * 出力内容として追加できる場合にtrueが返ります。
			 */
			protected boolean canAppend(MCList<? extends MCRow> rsltL) {
				// 列数チェック
				int size = getMaxColSize();
				if (getHdrLbls().length > size || getDatCols().length > size) {
					throw new MCAppException(MAUDL0404);
				}
				return true;
			}

			/**
			 * ファイルタイプに対応するワークブックを作成します。
			 */
			protected void crtWorkbook() {
				Workbook wb = null;
				switch (_typ) {
					case FileInfo.XLS :
						wb = new HSSFWorkbook();
						break;
					case FileInfo.XLSX :
						SXSSFWorkbook sxsswb = new SXSSFWorkbook();
						sxsswb.setCompressTempFiles(true);
						wb = sxsswb;
						break;
				}
				wb.getFontAt((short) 0).setFontName(getFont());
				_wb = wb;
			}

			/**
			 * ファイルタイプに対応するシートを作成します。
			 */
			protected void crtSheet() {
				Sheet sh = null;
				switch (_typ) {
					case FileInfo.XLS :
						sh = (HSSFSheet) _wb.createSheet();
						break;
					case FileInfo.XLSX :
						sh = (SXSSFSheet) _wb.createSheet();
						break;
				}
				_sh = sh;
			}

			/**
			 * ヘッダを出力します。
			 */
			protected void wrtHdr(String[] hdr) {
				Row row = _sh.createRow(_rowNum);
				for (int cellNum = 0; cellNum < hdr.length; cellNum++) {
					Cell cell = row.createCell(cellNum);
					cell.setCellValue(hdr[cellNum]);
				}
				if (hdr.length > 0) {
					_rowNum++;
				}
			}

			/**
			 * データを出力します。
			 */
			protected void wrtDat(Row row, int num, Comparable<?> c) {
				Cell cell = row.createCell(num);
				if (c == null) {
					cell.setCellValue("");
				}
				else if (c instanceof MCDate) {
					cell.setCellValue(((MCDate) c).toDate());
					cell.setCellStyle(getDtCellStyle(
						cell, num, getFmtMap().get(getDatCols()[num])));
				}
				else if (c instanceof MCTimestamp) {
					// ミリ秒の情報は非出力対象
					cell.setCellValue(((MCTimestamp) c).toDate());
					cell.setCellStyle(getTsCellStyle(
						cell, num, getFmtMap().get(getDatCols()[num])));
				}
				else if (c instanceof MCNumber) {
					cell.setCellValue(((MCNumber) c).doubleValue());
					cell.setCellStyle(getNumCellStyle(
						cell, num, ((MCNumber) c).scale()));
				}
				else if (c instanceof Boolean) {
					cell.setCellValue(MCBooleanUtil.booleanToDBString((Boolean)c));
				}
				else if (c instanceof String) {
					cell.setCellValue((String) c);
				}
				else {
					cell.setCellValue(c.toString());
				}
			}

			/**
			 * Date型のフォーマットを指定したセルスタイルを返します。
			 */
			protected CellStyle getDtCellStyle(Cell cell, int cellnum, String fmt) {
				MCFormatConst fmconst = MCLocaleConst.format(MCSys.user.locale());
				String key = isNull(fmt) ?
					fmconst.getDateOutputPattern(getDtFmt()) :
						fmconst.getDateOutputPattern(fmt);
				if (!_dtCellStyleMap.containsKey(key)) {
					short style = _wb.createDataFormat().getFormat(key);
					_dtCellStyleMap.put(key, _wb.getNumCellStyles());
					CellStyle cellStyle = _wb.createCellStyle();
					cellStyle.cloneStyleFrom(cell.getCellStyle());
					cellStyle.setDataFormat(style);
				}
				return _wb.getCellStyleAt(_dtCellStyleMap.get(key));
			}

			/**
			 * Timestamp型のフォーマットを指定したセルスタイルを返します。
			 */
			protected CellStyle getTsCellStyle(Cell cell, int cellnum, String fmt) {
				MCFormatConst fmconst = MCLocaleConst.format(MCSys.user.locale());
				String key = isNull(fmt) ?
					fmconst.getDateOutputPattern(getTsFmt()) :
						fmconst.getDateOutputPattern(fmt);
				if (!_tsCellStyleMap.containsKey(key)) {
					short style = _wb.createDataFormat().getFormat(key);
					_tsCellStyleMap.put(key, _wb.getNumCellStyles());
					CellStyle cellStyle = _wb.createCellStyle();
					cellStyle.cloneStyleFrom(cell.getCellStyle());
					cellStyle.setDataFormat(style);
				}
				return _wb.getCellStyleAt(_tsCellStyleMap.get(key));
			}

			/**
			 * Number型のフォーマットを指定したセルスタイルを返します。
			 */
			protected CellStyle getNumCellStyle(Cell cell, int cellnum, int scale) {
				if (!_numCellStyleMap.containsKey(scale)) {
					String ptn = MCStringUtil.rightPad("0.", scale + 2, '0');
					if (scale == 0) {
						ptn = "0";
					}
					short style = _wb.createDataFormat().getFormat(ptn);
					_numCellStyleMap.put(scale, _wb.getNumCellStyles());
					CellStyle cellStyle = _wb.createCellStyle();
					cellStyle.cloneStyleFrom(cell.getCellStyle());
					cellStyle.setDataFormat(style);
				}
				return _wb.getCellStyleAt(_numCellStyleMap.get(scale));
			}

			/**
			 * ファイルを作成します。
			 */
			@Override
			public void out() {
				FileOutputStream out = null;
				try {
					String fp = FileInfo.getRevPath(
							getPath(), getFileL().size());
					out = new FileOutputStream(fp);
					if (_wb == null) {
						crtWorkbook();
						crtSheet();
						// 設定されているヘッダがあれば出力
						if (getHdrLbls().length > 0) {
							wrtHdr(getHdrLbls());
						}
					}
					_wb.write(out);
					getFileL().add(new File(fp));
					_wb = null;
					_rowNum = 0;
				}
				catch (IOException e) {
					throw new MCException(e);
				}
				finally {
					try {
						if (out != null) {
							out.close();
						}
						if (_wb instanceof SXSSFWorkbook) {
							((SXSSFWorkbook)_wb).dispose();
						}
					}
					catch (IOException e) {
						throw new MCException(e);
					}
				}
			}

		}

		//************************************************************

		/**
		 * CSV出力用クラス
		 */
		public class BizDatDLerForCSV extends MCCSVFile implements IfBizDatDLer {

			/**
			 * コンストラクタです。
			 */
			protected BizDatDLerForCSV() {
				init();
			}

			/**
			 * 初期化処理を行います。
			 */
			protected void init() {
				useHeading(true);
				append(true);
				setManualClose(true);
			}

			@Override
			public String getFilePath() {
				return MAUDL_BizDatDLer.BizDatDLer.this.getPath();
			}

			@Override
			public String getCharset() {
				return MAUDL_BizDatDLer.BizDatDLer.this.getCharSet();
			}

			@Override
			public String writeHeadingLine() {
				return String.join(getDelimiter(), getHdrLbls());
			}

			@Override
			public MCReportMeta[] getWriteReportMetaArray(int rowIndex, MCRow r, String rType) {
				List<MCReportMeta> metaL = new ArrayList<>();
				MCFormatConst fmconst = MCLocaleConst.format(MCSys.user.locale());
				for (int i = 0; i < getDatCols().length; i++) {
					String col = getDatCols()[i];
//					if (!r.contains(col)) {
//						r.addStringColumn(col);
//					}
					String fmtStyle = "";
					String fmt = getFmtMap().get(getDatCols()[i]);
					switch (r.getMeta(col).type()) {
						case DATE :
							fmtStyle = isNull(fmt) ?
								fmconst.getDateOutputPattern(getDtFmt()) :
									fmconst.getDateOutputPattern(fmt);
							break;
						case TIMESTAMP :
							fmtStyle = isNull(fmt) ?
								fmconst.getDateOutputPattern(getTsFmt()) :
									fmconst.getDateOutputPattern(fmt);
							break;
						default :
					}
					metaL.add(new MCReportMeta(r.getMeta(col), col, fmtStyle, "", true));
				}
				return metaL.toArray(new MCReportMeta[0]);
			}

			/**
			 * 出力内容を追加します。
			 */
			@Override
			public void append(MCList<? extends MCRow> rsltL) {
				if (isNull(rsltL)) {
					return;
				}
				setOutInfo(rsltL);
				crtRepSet();
				for (int i = 0; i < rsltL.size(); i++) {
					// ブロック種別は任意
					getReportSet().addRow("DUMMY", rsltL.get(i));
				}
				write(getFilePath());
				if (isHeading()) {
					useHeading(false);
				}
				_datRowCnt += getReportSet().size();
				getReportSet().clear();
			}

			/**
			 * ReportSetを作成します。
			 */
			protected void crtRepSet() {
				if (getReportSet() == null) {
					setReportSet(MCCSVReportSet.create(MCRow.class));
				}
			}

			/**
			 * ファイルを作成します。
			 */
			@Override
			public void out() {
				if (getReportSet() == null) {
					crtRepSet();
					// 設定されているヘッダがあれば出力
					if (getHdrLbls().length == 0) {
						useHeading(false);
					}
				}
				write(getFilePath());
				getFileL().add(new File(getFilePath()));
				writeClose();
				useHeading(true);
			}

		}

		//************************************************************

	}

}
